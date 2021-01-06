package com.epita.tpalimentation.infrastructure;

import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.domaine.entity.AlimentGroupe;
import com.epita.tpalimentation.exceptions.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;


//@RunWith(SpringRunner.class)      // JUnit 4
@ExtendWith(SpringExtension.class)  //pour basculer vers JUnit 5 jupiter
@SpringBootTest
public class AlimentRepositoryTest {

    @Autowired
    private AlimentRepository alimentRepository;


    @Test
    public void given_AlimCode_Should_Return_Aliment() throws NotFoundException {
       //Given
        String alimCode = "10001";

        //When
        Aliment aliment = alimentRepository.getAlimentByCode(alimCode);

        //Then
        assertThat(aliment).isNotNull();
        assertThat(aliment.getAlimCode()).isEqualTo("10001");

    }


    @Test
    public void given_NonValideAlimCode_Should_CatchNotFoundException()  {
        //Given
        String alimCode = "99999";

        //When
        Throwable exception = catchThrowable(
                () -> {
                    Aliment aliment = alimentRepository.getAlimentByCode(alimCode);
                }
        );  // ()-> {}  écriture lambda

        //Then
        assertThat(exception).isNotNull();
    }


    @Test
    public void save_Aliment_Should_be_Success() throws NotFoundException {

        //Given
        Aliment aliment = new Aliment();
        aliment.setAlimCode("888888");
        aliment.setAlimNomFr("Test aliment");
        aliment.setAlimNomSci("Test Nom SCI");

        AlimentGroupe groupe = new AlimentGroupe();
        groupe.setAlimGrpCode("99");
        groupe.setAlimGrpNomFr("test Group");

        aliment.setAlimentGroupe(groupe);


        //When
        alimentRepository.saveAliment(aliment);

        //Then
        assertThat(alimentRepository.getAlimentByCode(aliment.getAlimCode())).isNotNull();

    }

    //@Test
    @Test
    public void soulde_return_aAliment_with_max_Calcium() {
        //Given

        //When
        Aliment aliment = alimentRepository.getAlimentMaxCalcium();

        //Then
        assertThat(aliment).isNotNull();

    }
}
