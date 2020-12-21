package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompositionEnergie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compositionEnergieCode;

    private String energieKJ;

    private String energieKCAL;

    private String energieJonesKJ;

    private String energieJonesKCAL;

    public Long getCompositionEnergieCode() {
        return compositionEnergieCode;
    }

    public void setCompositionEnergieCode(Long compositionEnergieCode) {
        this.compositionEnergieCode = compositionEnergieCode;
    }

    public String getEnergieKJ() {
        return energieKJ;
    }

    public void setEnergieKJ(String energieKJ) {
        this.energieKJ = energieKJ;
    }

    public String getEnergieKCAL() {
        return energieKCAL;
    }

    public void setEnergieKCAL(String energieKCAL) {
        this.energieKCAL = energieKCAL;
    }

    public String getEnergieJonesKJ() {
        return energieJonesKJ;
    }

    public void setEnergieJonesKJ(String energieJonesKJ) {
        this.energieJonesKJ = energieJonesKJ;
    }

    public String getEnergieJonesKCAL() {
        return energieJonesKCAL;
    }

    public void setEnergieJonesKCAL(String energieJonesKCAL) {
        this.energieJonesKCAL = energieJonesKCAL;
    }
}
