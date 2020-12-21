package com.epita.tpalimentation.infrastructure;

import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;
import com.epita.tpalimentation.infrastructure.jpaRepository.AlimentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public class AlimentRepositoryImpl implements AlimentRepository {
    @Autowired
    private AlimentJpaRepository alimentJpaRepository;

    @Override
    public void saveAliment(Aliment aliment) {
        alimentJpaRepository.save(aliment);
    }

    @Override
    public Aliment getAlimentByCode(String alimCode) throws NotFoundException {

        return alimentJpaRepository.findById(alimCode).orElseThrow(() -> new NotFoundException("Aliment " + alimCode + " Not found"));
    }

    @Override
    public Aliment getAlimentMaxCalcium() {

        return alimentJpaRepository.findByWhatever();
    }
}
