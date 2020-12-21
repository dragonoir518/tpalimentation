package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alim_ssssgroupe")
public class AlimentSousSousGroupe {

    @Id
    private String alimSsSsGrpCode;

    private String alimSsSsGrpNomFr;

    public String getAlimSsSsGrpCode() {
        return alimSsSsGrpCode;
    }

    public void setAlimSsSsGrpCode(String alimSsSsGrpCode) {
        this.alimSsSsGrpCode = alimSsSsGrpCode;
    }

    public String getAlimSsSsGrpNomFr() {
        return alimSsSsGrpNomFr;
    }

    public void setAlimSsSsGrpNomFr(String alimSsSsGrpNomFr) {
        this.alimSsSsGrpNomFr = alimSsSsGrpNomFr;
    }
}
