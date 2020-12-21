package com.epita.tpalimentation.infrastructure;

import com.epita.tpalimentation.domaine.entity.Aliment;
import com.epita.tpalimentation.exceptions.NotFoundException;

public interface AlimentRepository {
    void saveAliment(Aliment aliment);
    Aliment getAlimentByCode(String alimCode) throws NotFoundException;
    Aliment getAlimentMaxCalcium();
}
