package com.epita.tpalimentation.domaine.entity;

import javax.persistence.*;

@Entity
public class Aliment {

    @Id
    private String alimCode;

    private String alimNomFr;

    private String alimNomSci;

    @ManyToOne (cascade = CascadeType.ALL)
    AlimentGroupe alimentGroupe;

    @ManyToOne(cascade = CascadeType.ALL)
    AlimentSousGroupe alimentSousGroupe;

    @ManyToOne(cascade = CascadeType.ALL)
    AlimentSousSousGroupe alimentSousSousGroupe;

    @OneToOne(cascade = CascadeType.ALL)
    CompositionEnergie compositionEnergie;

    @OneToOne(cascade = CascadeType.ALL)
    CompositionVitamine compositionVitamine;

    @OneToOne(cascade = CascadeType.ALL)
    CompositionAutres compositionAutres;

    @OneToOne (cascade = CascadeType.ALL)
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
}
