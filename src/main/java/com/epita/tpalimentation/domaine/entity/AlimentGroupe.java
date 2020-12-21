package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alim_groupe")
public class AlimentGroupe {

    @Id
    private String alimGrpCode;

    private String alimGrpNomFr;

    public String getAlimGrpCode() {
        return alimGrpCode;
    }

    public void setAlimGrpCode(String alimGrpCode) {
        this.alimGrpCode = alimGrpCode;
    }

    public String getAlimGrpNomFr() {
        return alimGrpNomFr;
    }

    public void setAlimGrpNomFr(String alimGrpNomFr) {
        this.alimGrpNomFr = alimGrpNomFr;
    }
}
