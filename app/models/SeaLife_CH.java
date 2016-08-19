package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Blob;
import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;

@MongoEntity(value = "sea_life_ch")
public class SeaLife_CH extends MongoModel {

	
	public Date created_at_ch;
	
	public Date updated_at_ch;
	@Required
	@MaxSize(50)
	public String title_ch;
	@MaxSize(100)
	public String common_name_ch; // 常用名
	@MaxSize(1000)
	public String description_ch; // 概述
	public String type_ch; // 化学类别
	public Blob img_ch;
	@MaxSize(300)
	public String img_link_ch;
	@MaxSize(1000)
	public String synonyms_ch; // 同系物
	@MaxSize(200)
	public String chemical_formula_ch;
	public String weight_ch;
	@MaxSize(500)
	public String iupac_ch;
	@MaxSize(100)
	public String cas_ch;
	@MaxSize(500)
	public String inchi_identifier_ch;
	public String inchi_key_ch;
	public String smiles_isomeric_ch;
	public String smiles_canonical_ch;
	@MaxSize(100)
	public String mol_ch;
	@MaxSize(100)
	public String organism_ch; // 组织器官
	public String kingdom_ch;
	public String super_class_ch;
	public String class_ch;
	public String sub_class_ch;
	public String direct_parent_ch;
	public String alternative_parents_ch;
	public String molecular_framework_ch;
	public String substituents_ch;
	public String external_descriptors_ch;
	@MaxSize(50)
	public String appearance_ch; // 外观（appearance）
	@MaxSize(50)
	public String melting_point_ch;
	@MaxSize(50)
	public String boiling_point_ch;
	@MaxSize(50)
	public String density_ch;
	@MaxSize(50)
	public String flash_point_ch;
	@MaxSize(50)
	public String solubility_ch;
	@MaxSize(50)
	public String specific_gravity_ch;
	@MaxSize(50)
	public String vapour_pressure_ch;
	public String predicted_logP;
	@MaxSize(100)
	public String route_of_exposure_ch; // 暴露途径（route_of_exposure）
	@MaxSize(1000)
	public String mechanism_of_action_ch; // 作用机制（mechanism_of_action）
	public String interacting_proteins_ch; // 相互作用蛋白（interacting_proteins）
	@MaxSize(1000)
	public String metabolism_ch; // 代谢（metabolism）
	@MaxSize(50)
	public String toxicity_ch; // 毒性（toxicity）
	@MaxSize(100)
	public String lethaldose_ch; // 致死剂量（lethal dose）
	public String carcinogenicity_ch; // 致癌性（carcinogenicity）
	public String use_source_ch; // 用途（use_source）
	@MaxSize(50)
	public String min_risk_level_ch; // 最小的风险水平（min_risk_level）
	@MaxSize(1000)
	public String health_effects_ch; // （健康的影响（health_effects）
	@MaxSize(1000)
	public String symptoms_ch; // 症状（symptoms）
	@MaxSize(1000)
	public String treatment_ch; // 治疗（treatment）
	@ManyToMany(cascade={CascadeType.REMOVE})
    public List<Target_CH> targets; // 靶点（targets）
	@MaxSize(20)
	public String drugbank_ch;
	public String drugbank_link_ch;
	@MaxSize(20)
	public String pubchem_ch;
	public String pubchem_link_ch;
	@MaxSize(20)
	public String kegg_compound_ch;
	public String kegg_compound_link_ch;
	@MaxSize(20)
	public String uniprot_ch;
	public String uniprot_link_ch;
	@MaxSize(20)
	public String omim_ch;
	public String omim_link_ch;
	@MaxSize(20)
	public String chebi_ch;
	public String chebi_link_ch;
	@MaxSize(20)
	public String biocyc_ch;
	public String biocyc_link_ch;
	@MaxSize(20)
	public String ctd_ch;
	public String ctd_link_ch;
	@MaxSize(20)
	public String stitch_ch;
	public String stitch_link_ch;
	@MaxSize(20)
	public String pdb_ch;
	public String pdb_link_ch;
	@MaxSize(20)
	public String actor_ch;
	public String actor_link_ch;
	@MaxSize(100)
	public String wikipedia_ch;
	@MaxSize(50)
	public String supertoxic_ch;
	@MaxSize(1000)
	public String reference_ch;
	public Boolean isShow_ch;
	@Required
	public String auth_ch;


	public String toString() {
		return title_ch;
	}

}