package com.epita.tpalimentation.domaine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompositionVitamine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compositionVitamineCode;

    private String vitamineD;

    private String vitamineE;

    private String vitamineK1;

    private String vitamineK2;

    private String vitamineC;

    private String vitamineB1;

    private String vitamineB2;

    private String vitamineB3;

    private String vitamineB5;

    private String vitamineB6;

    private String vitamineB9;

    private String vitamineB12;

    public Long getCompositionVitamineCode() {
        return compositionVitamineCode;
    }

    public void setCompositionVitamineCode(Long compositionVitamineCode) {
        this.compositionVitamineCode = compositionVitamineCode;
    }

    public String getVitamineD() {
        return vitamineD;
    }

    public void setVitamineD(String vitamineD) {
        this.vitamineD = vitamineD;
    }

    public String getVitamineE() {
        return vitamineE;
    }

    public void setVitamineE(String vitamineE) {
        this.vitamineE = vitamineE;
    }

    public String getVitamineK1() {
        return vitamineK1;
    }

    public void setVitamineK1(String vitamineK1) {
        this.vitamineK1 = vitamineK1;
    }

    public String getVitamineK2() {
        return vitamineK2;
    }

    public void setVitamineK2(String vitamineK2) {
        this.vitamineK2 = vitamineK2;
    }

    public String getVitamineC() {
        return vitamineC;
    }

    public void setVitamineC(String vitamineC) {
        this.vitamineC = vitamineC;
    }

    public String getVitamineB1() {
        return vitamineB1;
    }

    public void setVitamineB1(String vitamineB1) {
        this.vitamineB1 = vitamineB1;
    }

    public String getVitamineB2() {
        return vitamineB2;
    }

    public void setVitamineB2(String vitamineB2) {
        this.vitamineB2 = vitamineB2;
    }

    public String getVitamineB3() {
        return vitamineB3;
    }

    public void setVitamineB3(String vitamineB3) {
        this.vitamineB3 = vitamineB3;
    }

    public String getVitamineB5() {
        return vitamineB5;
    }

    public void setVitamineB5(String vitamineB5) {
        this.vitamineB5 = vitamineB5;
    }

    public String getVitamineB6() {
        return vitamineB6;
    }

    public void setVitamineB6(String vitamineB6) {
        this.vitamineB6 = vitamineB6;
    }

    public String getVitamineB9() {
        return vitamineB9;
    }

    public void setVitamineB9(String vitamineB9) {
        this.vitamineB9 = vitamineB9;
    }

    public String getVitamineB12() {
        return vitamineB12;
    }

    public void setVitamineB12(String vitamineB12) {
        this.vitamineB12 = vitamineB12;
    }
}
