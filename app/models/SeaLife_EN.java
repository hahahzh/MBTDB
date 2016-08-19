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

@MongoEntity(value = "sea_life_en")
public class SeaLife_EN extends MongoModel {

	
	public Date created_at_en;
	
	public Date updated_at_en;
	@Required
	@MaxSize(50)
	public String title_en;
	@MaxSize(300)
	public String common_name_en; // 常用名
	@MaxSize(1000)
	public String description_en; // 概述
	public String type_en; // 化学类别
	public Blob img_en;
	@MaxSize(300)
	public String img_link_en;
	@MaxSize(1000)
	public String synonyms_en; // 同系物
	@MaxSize(200)
	public String chemical_formula_en;
	public String weight_en;
	@MaxSize(500)
	public String iupac_en;
	@MaxSize(100)
	public String cas_en;
	@MaxSize(500)
	public String inchi_identifier_en;
	public String inchi_key_en;
	public String smiles_isomeric_en;
	public String smiles_canonical_en;
	@MaxSize(100)
	public String mol_en;
	@MaxSize(100)
	public String organism_en; // 组织器官
	public String kingdom_en;
	public String super_class_en;
	public String class_en;
	public String sub_class_en;
	public String direct_parent_en;
	public String alternative_parents_en;
	public String molecular_framework_en;
	public String substituents_en;
	public String external_descriptors_en;
	@MaxSize(50)
	public String appearance_en; // 外观（appearance）
	@MaxSize(50)
	public String melting_point_en;
	@MaxSize(50)
	public String boiling_point_en;
	@MaxSize(50)
	public String density_en;
	@MaxSize(50)
	public String flash_point_en;
	@MaxSize(50)
	public String solubility_en;
	@MaxSize(50)
	public String specific_gravity_en;
	@MaxSize(50)
	public String vapour_pressure_en;
	public String predicted_logP;
	@MaxSize(100)
	public String route_of_exposure_en; // 暴露途径（route_of_exposure）
	@MaxSize(1000)
	public String mechanism_of_action_en; // 作用机制（mechanism_of_action）
	public String interacting_proteins_en; // 相互作用蛋白（interacting_proteins）
	@MaxSize(1000)
	public String metabolism_en; // 代谢（metabolism）
	@MaxSize(50)
	public String toxicity_en; // 毒性（toxicity）
	@MaxSize(100)
	public String lethaldose_en; // 致死剂量（lethal dose）
	public String carcinogenicity_en; // 致癌性（carcinogenicity）
	public String use_source_en; // 用途（use_source）
	@MaxSize(50)
	public String min_risk_level_en; // 最小的风险水平（min_risk_level）
	@MaxSize(1000)
	public String health_effects_en; // （健康的影响（health_effects）
	@MaxSize(1000)
	public String symptoms_en; // 症状（symptoms）
	@MaxSize(1000)
	public String treatment_en; // 治疗（treatment）
	@ManyToMany(cascade={CascadeType.REMOVE})
    public List<Target_CH> targets; // 靶点（targets）
	@MaxSize(20)
	public String drugbank_en;
	public String drugbank_link_en;
	@MaxSize(20)
	public String pubchem_en;
	public String pubchem_link_en;
	@MaxSize(20)
	public String kegg_compound_en;
	public String kegg_compound_link_en;
	@MaxSize(20)
	public String uniprot_en;
	public String uniprot_link_en;
	@MaxSize(20)
	public String omim_en;
	public String omim_link_en;
	@MaxSize(20)
	public String chebi_en;
	public String chebi_link_en;
	@MaxSize(20)
	public String biocyc_en;
	public String biocyc_link_en;
	@MaxSize(20)
	public String ctd_en;
	public String ctd_link_en;
	@MaxSize(20)
	public String stitch_en;
	public String stitch_link_en;
	@MaxSize(20)
	public String pdb_en;
	public String pdb_link_en;
	@MaxSize(20)
	public String actor_en;
	public String actor_link_en;
	@MaxSize(100)
	public String wikipedia_en;
	@MaxSize(50)
	public String supertoxic_en;
	@MaxSize(1000)
	public String reference_en;
	public Boolean isShow_en;
	@Required
	public String auth_en;

	public String toString() {
		return title_en;
	}

}