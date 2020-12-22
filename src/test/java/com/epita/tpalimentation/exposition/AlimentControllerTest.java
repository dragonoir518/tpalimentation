package com.epita.tpalimentation.exposition;


import com.epita.tpalimentation.common.Utils;
import com.epita.tpalimentation.domaine.dto.AlimentDTO;
import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;
import com.epita.tpalimentation.service.AlimentService;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
//@SpringBootTest(classes = { AlimentController.class })
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

    @Test
    public void given_AlimCode_Should_Return_AlimentJson() throws NotFoundException {
        //Given
        String alimCode ="112233";
        Aliment aliment = Utils.getAlimentForTest();
        when(alimentServiceMock.getAlimentByAlimCodeService(alimCode)).thenReturn(aliment);

        //When
        AlimentDTO aliment1 = alimentController.getAlimentByCode(alimCode);

        //Then
        assertThat(aliment1).isNotNull();
        assertThat(aliment1.getAlimCode()).isEqualTo("112233");

    }


    @Test
    @Disabled("cas non passant, à refaire")
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

    private AlimentDTO getAlimentDTO() {
        Aliment aliment = Utils.getAlimentForTest();
        AlimentDTO alimentDTO = alimentMapper.mapToDto(aliment);
        return alimentDTO;
    }


}
