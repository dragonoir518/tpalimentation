create table alimentation_source_nettoyage (
alim_grp_code VARCHAR(30),
alim_ssgrp_code VARCHAR(30),
alim_ssssgrp_code VARCHAR(30),
alim_grp_nom_fr VARCHAR(50),
alim_ssgrp_nom_fr VARCHAR(50),
alim_ssssgrp_nom_fr VARCHAR(50),
alim_code VARCHAR(30),
alim_nom_fr VARCHAR(250),
alim_nom_sci VARCHAR(120),
Energie_CODE INTEGER,
Energie_Reglement_UE_1169_2011_kJ_100_g VARCHAR(30),
Energie_Reglement_UE_1169_2011_kcal_100_g VARCHAR(30),
Energie_N_x_facteur_Jones_avec_fibres_kJ_100_g VARCHAR(30),
Energie_N_x_facteur_Jones_avec_fibres_kcal_100_g VARCHAR(30),
Eau_g_100_g VARCHAR(30),
Proteines_N_x_facteur_de_Jones_g_100_g VARCHAR(30),
Proteines_N_x_6_25_g_100_g VARCHAR(30),
Glucides_g_100_g VARCHAR(30),
Lipides_g_100_g VARCHAR(30),
Sucres_g_100_g VARCHAR(30),
Fructose_g_100_g VARCHAR(30),
Galactose_g_100_g VARCHAR(30),
Glucose_g_100_g VARCHAR(30),
Lactose_g_100_g VARCHAR(30),
Maltose_g_100_g VARCHAR(30),
Saccharose_g_100_g VARCHAR(30),
Amidon_g_100_g VARCHAR(30),
Fibres_alimentaires_g_100_g VARCHAR(30),
Polyols_totaux_g_100_g VARCHAR(30),
Cendres_g_100_g VARCHAR(30),
Alcool_g_100_g VARCHAR(30),
Acides_organiques_g_100_g VARCHAR(30),
AG_satures_g_100_g VARCHAR(30),
AG_monoinsatures_g_100_g VARCHAR(30),
AG_polyinsatures_g_100_g VARCHAR(30),
AG_4_0_butyrique_g_100_g VARCHAR(30),
AG_6_0_caproique_g_100_g VARCHAR(30),
AG_8_0_caprylique_g_100_g VARCHAR(30),
AG_10_0_caprique_g_100_g VARCHAR(30),
AG_12_0_laurique_g_100_g VARCHAR(30),
AG_14_0_myristique_g_100_g VARCHAR(30),
AG_16_0_palmitique_g_100_g VARCHAR(30),
AG_18_0_stearique_g_100_g VARCHAR(30),
AG_18_1_9c_n_9_oleique_g_100_g VARCHAR(30),
AG_18_2_9c_12c_n_6_linoleique_g_100_g VARCHAR(30),
AG_18_3_c9_c12_c15_n_3_alpha_linolenique_g_100_g VARCHAR(30),
AG_20_4_5c_8c_11c_14c_n_6_arachidonique_g_100_g VARCHAR(30),
AG_20_5_5c_8c_11c_14c_17c_n_3_EPA_g_100_g VARCHAR(30),
AG_22_6_4c_7c_10c_13c_16c_19c_n_3_DHA_g_100_g VARCHAR(30),
Cholesterol_mg_100_g VARCHAR(30),
Sel_chlorure_de_sodium_g_100_g VARCHAR(30),
Calcium_mg_100_g VARCHAR(30),
Chlorure_mg_100_g VARCHAR(30),
Cuivre_mg_100_g VARCHAR(30),
Fer_mg_100_g VARCHAR(30),
Iode_ug_100_g VARCHAR(30),
Magnesium_mg_100_g VARCHAR(30),
Manganese_mg_100_g VARCHAR(30),
Phosphore_mg_100_g VARCHAR(30),
Potassium_mg_100_g VARCHAR(30),
Selenium_ug_100_g VARCHAR(30),
Sodium_mg_100_g VARCHAR(30),
Zinc_mg_100_g VARCHAR(30),
Retinol_ug_100_g VARCHAR(30),
Beta_Carotene_ug_100_g VARCHAR(30),
Vitamine_D_ug_100_g VARCHAR(30),
Vitamine_E_mg_100_g VARCHAR(30),
Vitamine_K1_ug_100_g VARCHAR(30),
Vitamine_K2_ug_100_g VARCHAR(30),
Vitamine_C_mg_100_g VARCHAR(30),
Vitamine_B1_ou_Thiamine_mg_100_g VARCHAR(30),
Vitamine_B2_ou_Riboflavine_mg_100_g VARCHAR(30),
Vitamine_B3_ou_PP_ou_Niacine_mg_100_g VARCHAR(30),
Vitamine_B5_ou_Acide_pantothenique_mg_100_g VARCHAR(30),
Vitamine_B6_mg_100_g VARCHAR(30),
Vitamine_B9_ou_Folates_totaux_ug_100_g VARCHAR(30),
Vitamine_B12_ug_100_g VARCHAR(30)
);

---------------------------
-- nettoyage des données libéllé group 
update alimentation_source 
set alim_grp_nom_fr ='produits céréaliers'
where alim_grp_code='03' and alim_grp_nom_fr=''
;
--------------------------
-- netoyage des donées libellé sous groupe
update alimentation_source 
set alim_ssgrp_nom_fr ='-'
where alim_ssgrp_code='0000' and alim_ssgrp_nom_fr=''
;


update alimentation_source 
set alim_ssgrp_nom_fr ='aides culinaires et ingrédients pour végétariens'
where alim_ssgrp_code='1009' and alim_ssgrp_nom_fr='ingrédients divers'
;
--------------------------
-- nettoyage libellé ss sousgroup
-- netoyage des donées libellé sous groupe
update alimentation_source 
set alim_ssssgrp_nom_fr ='-'
where alim_ssssgrp_code='000000' and alim_ssssgrp_nom_fr=''
;
-----------------------------
--- nettoyage alim 9621 en double
update alimentation_source 
set energie_reglement_ue_1169_2011_kj_100_g ='1160'
where TRIM(alim_code)='9621' and energie_reglement_ue_1169_2011_kj_100_g=''
;

delete from alimentation_source
 where TRIM(alim_code)='9621' and eau_g_100_g='';


-- table groupe alim
create table alim_groupe (
alim_grp_code VARCHAR(2) NOT NULL,
alim_grp_nom_fr VARCHAR(100),
PRIMARY KEY (alimgrpcode));

--- alimentation_source
insert into alim_groupe (alim_grp_code,alim_grp_nom_fr)
select alim_grp_code, alim_grp_nom_fr 
from alimentation_source 
group by alim_grp_code, alim_grp_nom_fr
order by alim_grp_code asc;


--- alimentation sous groupe
create table alim_ssgroupe (
alim_ss_grp_code VARCHAR(4) NOT NULL,
alim_ss_grp_nom_fr VARCHAR(100),
PRIMARY KEY (alimssgrpcode));

insert into alim_ssgroupe (alim_ss_grp_code,alim_ss_grp_nom_fr)
select alim_ssgrp_code, alim_ssgrp_nom_fr 
from alimentation_source
group by alim_ssgrp_code,alim_ssgrp_nom_fr
order by alim_ssgrp_code asc
;


-- alimentation ss sous groupe

create table alim_ssssgroupe (
alim_ss_ss_grp_code VARCHAR(6) NOT NULL,
alim_ss_ss_grp_nom_fr VARCHAR(100),
PRIMARY KEY (alim_ss_ss_grp_code));

insert into alim_ssssgroupe (alim_ss_ss_grp_code,alim_ss_ss_grp_nom_fr)
select alim_ssssgrp_code, alim_ssssgrp_nom_fr 
from alimentation_source
group by alim_ssssgrp_code,alim_ssssgrp_nom_fr
order by alim_ssssgrp_code asc
;


insert into public.composition_vitamine (
	composition_vitamine_code,
	vitamineb1,	vitamineb2,	vitamineb3,	vitamineb5,
	vitamineb6,	vitamineb9,	vitamineb12, vitaminec,
	vitamined,	vitaminee,	vitaminek1,  vitaminek2
)
select energie_code,
vitamine_b1_ou_thiamine_mg_100_g,
vitamine_b2_ou_riboflavine_mg_100_g,
vitamine_b3_ou_pp_ou_niacine_mg_100_g,
vitamine_b5_ou_acide_pantothenique_mg_100_g,
vitamine_b6_mg_100_g,
vitamine_b9_ou_folates_totaux_ug_100_g,
vitamine_b12_ug_100_g,
vitamine_c_mg_100_g,
vitamine_d_ug_100_g,
vitamine_e_mg_100_g,
vitamine_k1_ug_100_g,
vitamine_k2_ug_100_g
from public.alimentation_source_nettoyage
where energie_code <>1 ;


insert into public.composition_energie (
	composition_energie_code,
	energie_joneskcal,
	energie_joneskj,
	energiekcal,
	energiekj
)
select energie_code,
energie_n_x_facteur_jones_avec_fibres_kcal_100_g,
energie_n_x_facteur_jones_avec_fibres_kj_100_g,
energie_reglement_ue_1169_2011_kcal_100_g,
energie_reglement_ue_1169_2011_kj_100_g
from public.alimentation_source_nettoyage
;



insert into public.composition_acides_gras (
composition_acides_gras_code,
	acides_gras_alpha_linolenique,
	acides_gras_arachidonique,
	acides_gras_butyrique,
	acides_gras_caprique,
	acides_gras_caproique,
	acides_gras_caprylique,
	acides_grasdha,
	acides_grasepa,
	acides_gras_laurique,
	acides_gras_linoleique,
	acides_gras_monoinsatures,
	acides_gras_myristique
)
select energie_code,ag_18_3_c9_c12_c15_n_3_alpha_linolenique_g_100_g,
ag_20_4_5c_8c_11c_14c_n_6_arachidonique_g_100_g,
ag_4_0_butyrique_g_100_g,ag_6_0_caproique_g_100_g,ag_8_0_caprylique_g_100_g,
ag_10_0_caprique_g_100_g,ag_22_6_4c_7c_10c_13c_16c_19c_n_3_dha_g_100_g,
ag_20_5_5c_8c_11c_14c_17c_n_3_epa_g_100_g,ag_12_0_laurique_g_100_g,
ag_18_2_9c_12c_n_6_linoleique_g_100_g,ag_monoinsatures_g_100_g,
ag_14_0_myristique_g_100_g
from public.alimentation_source_nettoyage
;


insert into public.composition_autres (
composition_autres_code,alcool,amidon,calcium,chlorure,
	cholestero,cuivre,eau,fer,
	fructose,glucose,glucides,lactose,maltose,lipides,potassium,sodium,sucres
)
select energie_code,
alcool_g_100_g,amidon_g_100_g,calcium_mg_100_g,chlorure_mg_100_g,cholesterol_mg_100_g,
cuivre_mg_100_g,eau_g_100_g,fer_mg_100_g,fructose_g_100_g,glucose_g_100_g,glucides_g_100_g,
lactose_g_100_g,maltose_g_100_g,lipides_g_100_g,potassium_mg_100_g,sodium_mg_100_g,sucres_g_100_g
from public.alimentation_source_nettoyage
;


insert into aliment (
alim_code,
alim_nom_fr, 
alim_nom_sci,
aliment_groupe_alim_grp_code,
aliment_sous_groupe_alim_ss_grp_code,
aliment_sous_sous_groupe_alim_ss_ss_grp_code,
composition_autres_composition_autres_code,
composition_energie_composition_energie_code,
composition_vitamine_composition_vitamine_code)
select alim_code, alim_nom_fr, alim_nom_sci,alim_grp_code,alim_ssgrp_code,alim_ssssgrp_code,
energie_code,energie_code,energie_code,energie_code
from public.alimentation_source_nettoyage