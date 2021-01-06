package com.epita.tpalimentation.service;

import com.epita.tpalimentation.common.Utils;
import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.domaine.entity.AlimentGroupe;
import com.epita.tpalimentation.exceptions.NotFoundException;
import com.epita.tpalimentation.infrastructure.AlimentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlimentServiceTest {
    /* Aliment service a 3 méthodes à tester.
     * Il faut mocker les méthodes de la couche Infra pour isoler les tests
     */

    @Autowired
    private AlimentService alimentService;

    @MockBean
    private AlimentRepository alimentRepositoryMock;


    @Test
    public void given_AlimCode_Should_Return_Aliment() throws NotFoundException {
        //Given *************************************************************************
        String alimCode = "112233";

        Aliment aliment = Utils.getAlimentForTest();

        //créer le mock alimentRepository pour simuler le comportement AlimentRepository
        Mockito.when(alimentRepositoryMock.getAlimentByCode(alimCode)).thenReturn(aliment);

        //When  *************************************************************************
        Aliment alimentReturn = alimentService.getAlimentByAlimCodeService(alimCode);


        //Then  *************************************************************************
        assertThat(alimentReturn).isNotNull();
        assertThat(alimentReturn.getAlimCode()).isEqualTo("112233");
        assertThat(alimentReturn.getAlimNomFr()).isEqualTo("Test aliment");
        assertThat(alimentReturn.getAlimentGroupe().getAlimGrpCode()).isEqualTo("99");
    }


    @Test
    public void save_Aliment_Should_Be_Sucess() {
        //Given *************************************************************************
        Aliment aliment = Utils.getAlimentForTest();
        //créer le mock alimentRepository pour simuler le comportement AlimentRepository
        Mockito.doNothing().when(alimentRepositoryMock).saveAliment(aliment);

        //When *************************************************************************
        alimentService.saveAlimentService(aliment);

        //Then *************************************************************************
        //vérifier si alimentRepositoryMock est appelé une fois lors de save d'aliment
        verify(alimentRepositoryMock,times(1)).saveAliment(aliment);

    }



    @Test
    public void get_Aliment_With_Max_Calcium_Should_Be_Success() {
        //Given *************************************************************************
        //Créer Mock
        Aliment aliment = Utils.getAlimentForTest();
        Mockito.when(alimentRepositoryMock.getAlimentMaxCalcium()).thenReturn(aliment);

        //When *************************************************************************
        Aliment aliment1 = alimentService.getAlimentMaxCalciumService();

        //Then *************************************************************************
        assertThat(aliment1).isNotNull();
        assertThat(aliment1.getAlimCode()).isEqualTo("112233");
        //vérifier on a appelé 1 fois getAlimentMaxCalcium
        verify(alimentRepositoryMock,times(1)).getAlimentMaxCalcium();
    }

}
