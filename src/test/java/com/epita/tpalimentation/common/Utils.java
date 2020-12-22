package com.epita.tpalimentation.common;

import com.epita.tpalimentation.domaine.entity.*;

public class Utils {

    public static Aliment getAlimentForTest() {

        //initialiser un objet Aliment pour test.
        Aliment aliment = new Aliment();
        aliment.setAlimCode("112233");
        aliment.setAlimNomFr("Test aliment");
        aliment.setAlimNomSci("Test Nom SCI");

        AlimentGroupe groupe = new AlimentGroupe();
        groupe.setAlimGrpCode("99");
        groupe.setAlimGrpNomFr("test Group");

        aliment.setAlimentGroupe(groupe);

        AlimentSousGroupe alimentSousGroupe = new AlimentSousGroupe();
        alimentSousGroupe.setAlimSsGrpCode("9999");
        alimentSousGroupe.setAlimSsGrpNomFr("test sous groupe");

        aliment.setAlimentSousGroupe(alimentSousGroupe);

        AlimentSousSousGroupe alimentSousSousGroupe = new AlimentSousSousGroupe();
        alimentSousSousGroupe.setAlimSsSsGrpCode("999999");
        alimentSousSousGroupe.setAlimSsSsGrpNomFr("test sous sous groupe");

        aliment.setAlimentSousSousGroupe(alimentSousSousGroupe);

        //////////composition /////////////////////////////////
        CompositionAcidesGras compositionAcidesGras = new CompositionAcidesGras();
        compositionAcidesGras.setAcidesGrasArachidonique("15");
        CompositionAutres compositionAutres = new CompositionAutres();
        compositionAutres.setAlcool("15");
        CompositionEnergie compositionEnergie = new CompositionEnergie();
        compositionEnergie.setEnergieKJ("15");
        CompositionVitamine compositionVitamine = new CompositionVitamine();
        compositionVitamine.setVitamineB1("15");
        ///////////////////////////////////////////////
        aliment.setCompositionAcidesGras(compositionAcidesGras);
        aliment.setCompositionVitamine(compositionVitamine);
        aliment.setCompositionEnergie(compositionEnergie);
        aliment.setCompositionAutres(compositionAutres);

        return aliment;

    }
}
