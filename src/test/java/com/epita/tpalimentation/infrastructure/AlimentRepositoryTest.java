package com.epita.tpalimentation.infrastructure;

import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;


@RunWith(SpringRunner.class)
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
}
