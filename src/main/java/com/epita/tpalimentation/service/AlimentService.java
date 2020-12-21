package com.epita.tpalimentation.service;

import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;

public interface AlimentService {
    void saveAlimentService(Aliment aliment);
    Aliment getAlimentByAlimCodeService(String alimCode) throws NotFoundException;
    Aliment getAlimentMaxCalciumService();
}
