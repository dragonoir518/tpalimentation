package com.epita.tpalimentation.exposition;

import com.epita.tpalimentation.domaine.dto.AlimentDTO;
import com.epita.tpalimentation.domaine.entity.Aliment;
import org.springframework.stereotype.Component;

@Component
public class AlimentMapperImpl implements AlimentMapper {
    @Override
    public Aliment mapToEntity(AlimentDTO dto) {
        Aliment aliment = new Aliment();

        aliment.setAlimCode(dto.getAlimCode());
        aliment.setAlimNomFr(dto.getAlimNomFr());
        aliment.setAlimNomSci(dto.getAlimNomSci());
        aliment.setAlimentGroupe(dto.getAlimentGroupe());
        aliment.setAlimentSousGroupe(dto.getAlimentSousGroupe());
        aliment.setAlimentSousSousGroupe(dto.getAlimentSousSousGroupe());
        aliment.setCompositionAutres(dto.getCompositionAutres());
        aliment.setCompositionEnergie(dto.getCompositionEnergie());
        aliment.setCompositionAcidesGras(dto.getCompositionAcidesGras());
        aliment.setCompositionVitamine(dto.getCompositionVitamine());


        return aliment;
    }

    @Override
    public AlimentDTO mapToDto(Aliment entity) {

        AlimentDTO dto = new AlimentDTO();
        dto.setAlimCode(entity.getAlimCode());
        dto.setAlimNomFr(entity.getAlimNomFr());
        dto.setAlimNomSci(entity.getAlimNomSci());
        dto.setAlimentGroupe(entity.getAlimentGroupe());
        dto.setAlimentSousGroupe(entity.getAlimentSousGroupe());
        dto.setAlimentSousSousGroupe(entity.getAlimentSousSousGroupe());
        dto.setCompositionAutres(entity.getCompositionAutres());
        dto.setCompositionEnergie(entity.getCompositionEnergie());
        dto.setCompositionAcidesGras(entity.getCompositionAcidesGras());
        dto.setCompositionVitamine(entity.getCompositionVitamine());
        return dto;
    }


}
