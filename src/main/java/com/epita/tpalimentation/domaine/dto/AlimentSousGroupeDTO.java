package com.epita.tpalimentation.domaine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlimentSousGroupeDTO {

    @JsonProperty("alimentSousGroupeCode")
    private String alimSsGrpCode;

    @JsonProperty("alimentSousGroupeNomFr")
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
