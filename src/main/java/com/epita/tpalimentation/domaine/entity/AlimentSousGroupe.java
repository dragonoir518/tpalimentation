package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alim_ssgroupe")
public class AlimentSousGroupe {

    @Id
    private String alimSsGrpCode;

    private String alimSsGrpNomFr;

    public String getAlimSsGrpCode() {
        return alimSsGrpCode;
    }

    public void setAlimSsGrpCode(String alimSsGrpCode) {
        this.alimSsGrpCode = alimSsGrpCode;
    }

    public String getAlimSsGrpNomFr() {
        return alimSsGrpNomFr;
    }

    public void setAlimSsGrpNomFr(String alimSsGrpNomFr) {
        this.alimSsGrpNomFr = alimSsGrpNomFr;
    }
}
