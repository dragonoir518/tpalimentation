package com.epita.tpalimentation.domaine.dto;

import com.epita.tpalimentation.domaine.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class AlimentDTO implements Serializable {

    @JsonProperty("alimentCode")
    private String alimCode;

    @JsonProperty("alimentNomFr")
    private String alimNomFr;

    @JsonProperty("alimentNomSci")
    private String alimNomSci;

    @JsonProperty("alimentGroupe")
    AlimentGroupe alimentGroupe;

    @JsonProperty("alimentSousGroupe")
    AlimentSousGroupe alimentSousGroupe;

    @JsonProperty("alimentSousSousGroupe")
    AlimentSousSousGroupe alimentSousSousGroupe;

    @JsonProperty("compositionEnergie")
    CompositionEnergie compositionEnergie;

    @JsonProperty("compositionVitamine")
    CompositionVitamine compositionVitamine;

    @JsonProperty("compositionAutres")
    CompositionAutres compositionAutres;

    @JsonProperty("compositionAcidesGras")
    CompositionAcidesGras compositionAcidesGras;

    public CompositionAcidesGras getCompositionAcidesGras() {
        return compositionAcidesGras;
    }

    public void setCompositionAcidesGras(CompositionAcidesGras compositionAcidesGras) {
        this.compositionAcidesGras = compositionAcidesGras;
    }

    public String getAlimCode() {
        return alimCode;
    }

    public void setAlimCode(String alimCode) {
        this.alimCode = alimCode;
    }

    public String getAlimNomFr() {
        return alimNomFr;
    }

    public void setAlimNomFr(String alimNomFr) {
        this.alimNomFr = alimNomFr;
    }

    public String getAlimNomSci() {
        return alimNomSci;
    }

    public void setAlimNomSci(String alimNomSci) {
        this.alimNomSci = alimNomSci;
    }

    public AlimentGroupe getAlimentGroupe() {
        return alimentGroupe;
    }

    public void setAlimentGroupe(AlimentGroupe alimentGroupe) {
        this.alimentGroupe = alimentGroupe;
    }

    public AlimentSousGroupe getAlimentSousGroupe() {
        return alimentSousGroupe;
    }

    public void setAlimentSousGroupe(AlimentSousGroupe alimentSousGroupe) {
        this.alimentSousGroupe = alimentSousGroupe;
    }

    public AlimentSousSousGroupe getAlimentSousSousGroupe() {
        return alimentSousSousGroupe;
    }

    public void setAlimentSousSousGroupe(AlimentSousSousGroupe alimentSousSousGroupe) {
        this.alimentSousSousGroupe = alimentSousSousGroupe;
    }

    public CompositionEnergie getCompositionEnergie() {
        return compositionEnergie;
    }

    public void setCompositionEnergie(CompositionEnergie compositionEnergie) {
        this.compositionEnergie = compositionEnergie;
    }

    public CompositionVitamine getCompositionVitamine() {
        return compositionVitamine;
    }

    public void setCompositionVitamine(CompositionVitamine compositionVitamine) {
        this.compositionVitamine = compositionVitamine;
    }

    public CompositionAutres getCompositionAutres() {
        return compositionAutres;
    }

    public void setCompositionAutres(CompositionAutres compositionAutres) {
        this.compositionAutres = compositionAutres;
    }

    @Override
    public String toString() {
        return "AlimentDTO{" +
                "alimCode='" + alimCode + '\'' +
                ", alimNomFr='" + alimNomFr + '\'' +
                ", alimNomSci='" + alimNomSci + '\'' +
                ", alimentGroupe=" + alimentGroupe +
                ", alimentSousGroupe=" + alimentSousGroupe +
                ", alimentSousSousGroupe=" + alimentSousSousGroupe +
                ", compositionEnergie=" + compositionEnergie +
                ", compositionVitamine=" + compositionVitamine +
                ", compositionAutres=" + compositionAutres +
                '}';
    }
}
