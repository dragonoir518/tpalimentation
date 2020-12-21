package com.epita.tpalimentation.domaine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlimentSousSousGroupeDTO {

    @JsonProperty("alimentSousSousGroupeCode")
    private String alimSsSsGrpCode;

    @JsonProperty("alimentSousSousGroupeNomFr")
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
