package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompositionAutres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compositionAutresCode;

    private String eau;

    private String proteinesJones;

    private String proteines625;

    private String glucides;

    private String lipides;

    private String sucres;

    private String fructose;

    private String galactose;

    private String glucose;

    private String lactose;

    private String maltose;

    private String saccharose;

    private String amidon;

    private String fibresAlimentaires;

    private String polyolsTotaux;

    private String cendres;

    private String alcool;

    private String cholestero;

    private String selChlorureDeSodium;

    private String calcium;

    private String chlorure;

    private String cuivre;

    private String fer;

    private String iode;



    private String manganese;

    private String phosphore;

    private String potassium;

    private String selenium;

    private String sodium;

    private String zinc;

    private String retinol;

    private String betaCarotene;


    public Long getCompositionAutresCode() {
        return compositionAutresCode;
    }

    public void setCompositionAutresCode(Long compositionAutresCode) {
        this.compositionAutresCode = compositionAutresCode;
    }

    public String getEau() {
        return eau;
    }

    public void setEau(String eau) {
        this.eau = eau;
    }

    public String getProteinesJones() {
        return proteinesJones;
    }

    public void setProteinesJones(String proteinesJones) {
        this.proteinesJones = proteinesJones;
    }

    public String getProteines625() {
        return proteines625;
    }

    public void setProteines625(String proteines625) {
        this.proteines625 = proteines625;
    }

    public String getGlucides() {
        return glucides;
    }

    public void setGlucides(String glucides) {
        this.glucides = glucides;
    }

    public String getLipides() {
        return lipides;
    }

    public void setLipides(String lipides) {
        this.lipides = lipides;
    }

    public String getSucres() {
        return sucres;
    }

    public void setSucres(String sucres) {
        this.sucres = sucres;
    }

    public String getFructose() {
        return fructose;
    }

    public void setFructose(String fructose) {
        this.fructose = fructose;
    }

    public String getGalactose() {
        return galactose;
    }

    public void setGalactose(String galactose) {
        this.galactose = galactose;
    }

    public String getGlucose() {
        return glucose;
    }

    public void setGlucose(String glucose) {
        this.glucose = glucose;
    }

    public String getLactose() {
        return lactose;
    }

    public void setLactose(String lactose) {
        this.lactose = lactose;
    }

    public String getMaltose() {
        return maltose;
    }

    public void setMaltose(String maltose) {
        this.maltose = maltose;
    }

    public String getSaccharose() {
        return saccharose;
    }

    public void setSaccharose(String saccharose) {
        this.saccharose = saccharose;
    }

    public String getAmidon() {
        return amidon;
    }

    public void setAmidon(String amidon) {
        this.amidon = amidon;
    }

    public String getFibresAlimentaires() {
        return fibresAlimentaires;
    }

    public void setFibresAlimentaires(String fibresAlimentaires) {
        this.fibresAlimentaires = fibresAlimentaires;
    }

    public String getPolyolsTotaux() {
        return polyolsTotaux;
    }

    public void setPolyolsTotaux(String polyolsTotaux) {
        this.polyolsTotaux = polyolsTotaux;
    }

    public String getCendres() {
        return cendres;
    }

    public void setCendres(String cendres) {
        this.cendres = cendres;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }


    public String getCholestero() {
        return cholestero;
    }

    public void setCholestero(String cholestero) {
        this.cholestero = cholestero;
    }

    public String getSelChlorureDeSodium() {
        return selChlorureDeSodium;
    }

    public void setSelChlorureDeSodium(String selChlorureDeSodium) {
        this.selChlorureDeSodium = selChlorureDeSodium;
    }

    public String getCalcium() {
        return calcium;
    }

    public void setCalcium(String calcium) {
        this.calcium = calcium;
    }

    public String getChlorure() {
        return chlorure;
    }

    public void setChlorure(String chlorure) {
        this.chlorure = chlorure;
    }

    public String getCuivre() {
        return cuivre;
    }

    public void setCuivre(String cuivre) {
        this.cuivre = cuivre;
    }

    public String getFer() {
        return fer;
    }

    public void setFer(String fer) {
        this.fer = fer;
    }

    public String getIode() {
        return iode;
    }

    public void setIode(String iode) {
        this.iode = iode;
    }


    public String getManganese() {
        return manganese;
    }

    public void setManganese(String manganese) {
        this.manganese = manganese;
    }

    public String getPhosphore() {
        return phosphore;
    }

    public void setPhosphore(String phosphore) {
        this.phosphore = phosphore;
    }

    public String getPotassium() {
        return potassium;
    }

    public void setPotassium(String potassium) {
        this.potassium = potassium;
    }

    public String getSelenium() {
        return selenium;
    }

    public void setSelenium(String selenium) {
        this.selenium = selenium;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getZinc() {
        return zinc;
    }

    public void setZinc(String zinc) {
        this.zinc = zinc;
    }

    public String getRetinol() {
        return retinol;
    }

    public void setRetinol(String retinol) {
        this.retinol = retinol;
    }

    public String getBetaCarotene() {
        return betaCarotene;
    }

    public void setBetaCarotene(String betaCarotene) {
        this.betaCarotene = betaCarotene;
    }


}
