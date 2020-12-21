package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompositionAcidesGras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compositionAcidesGrasCode;

    private String acidesOrganiques;

    private String acidesGrasnesium;

    private String acidesGrasSatures;

    private String acidesGrasMonoinsatures;

    private String acidesGrasPolyinsatures;

    private String acidesGrasButyrique;

    private String acidesGrasCaproique;

    private String acidesGrasCaprylique;

    private String acidesGrasCaprique;

    private String acidesGrasLaurique;

    private String acidesGrasMyristique;

    private String acidesGrasPalmitique;

    private String acidesGrasStearique;

    private String acidesGrasOleique;

    private String acidesGrasLinoleique;

    private String acidesGrasAlphaLinolenique;

    private String acidesGrasArachidonique;

    private String acidesGrasEPA;

    private String acidesGrasDHA;

    public Long getCompositionAcidesGrasCode() {
        return compositionAcidesGrasCode;
    }

    public void setCompositionAcidesGrasCode(Long compositionAcidesGrasCode) {
        this.compositionAcidesGrasCode = compositionAcidesGrasCode;
    }

    public String getAcidesOrganiques() {
        return acidesOrganiques;
    }

    public void setAcidesOrganiques(String acidesOrganiques) {
        this.acidesOrganiques = acidesOrganiques;
    }

    public String getAcidesGrasSatures() {
        return acidesGrasSatures;
    }

    public void setAcidesGrasSatures(String acidesGrasSatures) {
        this.acidesGrasSatures = acidesGrasSatures;
    }

    public String getAcidesGrasMonoinsatures() {
        return acidesGrasMonoinsatures;
    }

    public void setAcidesGrasMonoinsatures(String acidesGrasMonoinsatures) {
        this.acidesGrasMonoinsatures = acidesGrasMonoinsatures;
    }

    public String getAcidesGrasPolyinsatures() {
        return acidesGrasPolyinsatures;
    }

    public void setAcidesGrasPolyinsatures(String acidesGrasPolyinsatures) {
        this.acidesGrasPolyinsatures = acidesGrasPolyinsatures;
    }

    public String getAcidesGrasButyrique() {
        return acidesGrasButyrique;
    }

    public void setAcidesGrasButyrique(String acidesGrasButyrique) {
        this.acidesGrasButyrique = acidesGrasButyrique;
    }

    public String getAcidesGrasCaproique() {
        return acidesGrasCaproique;
    }

    public void setAcidesGrasCaproique(String acidesGrasCaproique) {
        this.acidesGrasCaproique = acidesGrasCaproique;
    }

    public String getAcidesGrasCaprylique() {
        return acidesGrasCaprylique;
    }

    public void setAcidesGrasCaprylique(String acidesGrasCaprylique) {
        this.acidesGrasCaprylique = acidesGrasCaprylique;
    }

    public String getAcidesGrasCaprique() {
        return acidesGrasCaprique;
    }

    public void setAcidesGrasCaprique(String acidesGrasCaprique) {
        this.acidesGrasCaprique = acidesGrasCaprique;
    }

    public String getAcidesGrasLaurique() {
        return acidesGrasLaurique;
    }

    public void setAcidesGrasLaurique(String acidesGrasLaurique) {
        this.acidesGrasLaurique = acidesGrasLaurique;
    }

    public String getAcidesGrasMyristique() {
        return acidesGrasMyristique;
    }

    public void setAcidesGrasMyristique(String acidesGrasMyristique) {
        this.acidesGrasMyristique = acidesGrasMyristique;
    }

    public String getAcidesGrasPalmitique() {
        return acidesGrasPalmitique;
    }

    public void setAcidesGrasPalmitique(String acidesGrasPalmitique) {
        this.acidesGrasPalmitique = acidesGrasPalmitique;
    }

    public String getAcidesGrasStearique() {
        return acidesGrasStearique;
    }

    public void setAcidesGrasStearique(String acidesGrasStearique) {
        this.acidesGrasStearique = acidesGrasStearique;
    }

    public String getAcidesGrasOleique() {
        return acidesGrasOleique;
    }

    public void setAcidesGrasOleique(String acidesGrasOleique) {
        this.acidesGrasOleique = acidesGrasOleique;
    }

    public String getAcidesGrasLinoleique() {
        return acidesGrasLinoleique;
    }

    public void setAcidesGrasLinoleique(String acidesGrasLinoleique) {
        this.acidesGrasLinoleique = acidesGrasLinoleique;
    }

    public String getAcidesGrasAlphaLinolenique() {
        return acidesGrasAlphaLinolenique;
    }

    public void setAcidesGrasAlphaLinolenique(String acidesGrasAlphaLinolenique) {
        this.acidesGrasAlphaLinolenique = acidesGrasAlphaLinolenique;
    }

    public String getAcidesGrasArachidonique() {
        return acidesGrasArachidonique;
    }

    public void setAcidesGrasArachidonique(String acidesGrasArachidonique) {
        this.acidesGrasArachidonique = acidesGrasArachidonique;
    }

    public String getAcidesGrasEPA() {
        return acidesGrasEPA;
    }

    public void setAcidesGrasEPA(String acidesGrasEPA) {
        this.acidesGrasEPA = acidesGrasEPA;
    }

    public String getAcidesGrasDHA() {
        return acidesGrasDHA;
    }

    public void setAcidesGrasDHA(String acidesGrasDHA) {
        this.acidesGrasDHA = acidesGrasDHA;
    }

    public String getAcidesGrasnesium() {
        return acidesGrasnesium;
    }

    public void setAcidesGrasnesium(String acidesGrasnesium) {
        this.acidesGrasnesium = acidesGrasnesium;
    }
}
