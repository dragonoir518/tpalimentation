package com.epita.tpalimentation.exposition;


import com.epita.tpalimentation.common.Utils;
import com.epita.tpalimentation.domaine.dto.AlimentDTO;
import com.epita.tpalimentation.domaine.entity.Aliment;

import com.epita.tpalimentation.service.AlimentService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


//@RunWith(SpringRunner.class)      // JUnit 4
@ExtendWith(SpringExtension.class)  //pour basculer vers JUnit 5 jupiter
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(controllers = AlimentController.class)
public class AlimentControllerTest {
/*
 * test les méthodes de la couche exposition avec Mock sur la couche service
 */
    @MockBean
    private AlimentService alimentServiceMock;

    @Autowired
    private AlimentController alimentController;

    @Autowired
    private AlimentMapper alimentMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void given_AlimCode_Should_Return_AlimentJson() throws Exception {

        //Given
        String alimCode ="112233";
        Aliment aliment = Utils.getAlimentForTest();
        when(alimentServiceMock.getAlimentByAlimCodeService(alimCode)).thenReturn(aliment);

        //When
        AlimentDTO aliment1 = alimentController.getAlimentByCode(alimCode);


        //When
        mockMvc.perform(get("/api/aliment/112233"))
                .andExpect(status().isOk());
        assertThat(aliment1).isNotNull();
        assertThat(aliment1.getAlimCode()).isEqualTo("112233");

    }



    @Test
    public void given_AlimentDTO_Should_Be_Save_InBDD() {
        //Given
        //on a AlimentDTO normalement saisit par User
        AlimentDTO alimentDTO = getAlimentDTO();


        //When
        alimentController.ajouterAliment(alimentDTO);

        //Then
        //vérifier on a appelé une fois le saveAlimentService
        verify(alimentServiceMock, times(1)).saveAlimentService(any());

    }

    @Test
    public void testGetAliment() throws Exception {
        //Given
        Aliment aliment = Utils.getAlimentForTest();
        when(alimentServiceMock.getAlimentMaxCalciumService()).thenReturn(aliment);

        //When
        mockMvc.perform(get("/api/alimentMaxCalcium")).andExpect(status().isOk());
                //.andExpect((ResultMatcher) jsonPath("$[0].alimCode", is("112233")));
    }

    private AlimentDTO getAlimentDTO() {
        Aliment aliment = Utils.getAlimentForTest();
        AlimentDTO alimentDTO = alimentMapper.mapToDto(aliment);
        return alimentDTO;
    }


}
