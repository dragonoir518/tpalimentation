package com.epita.tpalimentation.exposition;

import com.epita.tpalimentation.domaine.dto.AlimentDTO;
import com.epita.tpalimentation.domaine.entity.Aliment;

public interface AlimentMapper {
    Aliment mapToEntity(final AlimentDTO alimentDTO);
    AlimentDTO mapToDto(final Aliment aliment);
}
