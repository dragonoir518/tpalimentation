package com.epita.tpalimentation.domaine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlimentGroupeDTO {
    @JsonProperty("alimentGroupeCode")
    private String alimGrpCode;

    @JsonProperty("alimentGroupeNomFr")
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
