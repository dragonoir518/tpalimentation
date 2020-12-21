package com.epita.tpalimentation.service;

import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;
import com.epita.tpalimentation.infrastructure.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentServiceImpl implements AlimentService{

    @Autowired
    private AlimentRepository alimentRepository;

    @Override
    public void saveAlimentService(Aliment aliment) {
        alimentRepository.saveAliment(aliment);
    }

    @Override
    public Aliment getAlimentByAlimCodeService(String alimCode) throws NotFoundException {

        return alimentRepository.getAlimentByCode(alimCode);
    }

    @Override
    public Aliment getAlimentMaxCalciumService() {
        return alimentRepository.getAlimentMaxCalcium();
    }
}
