package models;

import java.util.Date;
import java.util.List;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;

import controllers.CRUD.Hidden;
import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.modules.morphia.Blob;
import play.modules.morphia.Model;


@Entity(value = "sea_life_ch")
public class SeaLife_CH extends Model {

	@Hidden
	public Long _created;
	@Hidden
	public Long _modified;
	
	@Required
	@MaxSize(100)
	public String title;
	@Required
	@MaxSize(200)
	public String common_name; // 常用名
	@MaxSize(3000)
	public String description; // 概述
	public String type; // 化学类别
	public Blob img;
	@MaxSize(300)
	public String img_link;
	@MaxSize(2000)
	public String synonyms; // 同系物
	@MaxSize(200)
	public String chemical_formula;
	public String weight;
	@MaxSize(1000)
	public String iupac;
	@MaxSize(100)
	public String cas;
	@MaxSize(1000)
	public String inchi_identifier;
	public String inchi_key;
	public String smiles_isomeric;
	public String smiles_canonical;
	@MaxSize(200)
	public String mol;
	@MaxSize(200)
	public String organism; // 组织器官
	public String kingdom;
	public String super_class;
	public String class_;
	public String sub_class;
	public String direct_parent;
	public String alternative_parents;
	public String molecular_framework;
	public String substituents;
	public String external_descriptors;
	@MaxSize(100)
	public String appearance; // 外观（appearance）
	@MaxSize(100)
	public String melting_point;
	@MaxSize(100)
	public String boiling_point;
	@MaxSize(100)
	public String density;
	@MaxSize(100)
	public String flash_point;
	@MaxSize(100)
	public String solubility;
	@MaxSize(100)
	public String specific_gravity;
	@MaxSize(100)
	public String vapour_pressure;
	public String predicted_logP;
	@MaxSize(200)
	public String route_of_exposure; // 暴露途径（route_of_exposure）
	@MaxSize(5000)
	public String mechanism_of_action; // 作用机制（mechanism_of_action）
	public String interacting_proteins; // 相互作用蛋白（interacting_proteins）
	@MaxSize(5000)
	public String metabolism; // 代谢（metabolism）
	@MaxSize(200)
	public String toxicity; // 毒性（toxicity）
	@MaxSize(200)
	public String lethaldose; // 致死剂量（lethal dose）
	public String carcinogenicity; // 致癌性（carcinogenicity）
	public String use_source; // 用途（use_source）
	@MaxSize(200)
	public String min_risk_level; // 最小的风险水平（min_risk_level）
	@MaxSize(5000)
	public String health_effects; // （健康的影响（health_effects）
	@MaxSize(5000)
	public String symptoms; // 症状（symptoms）
	@MaxSize(5000)
	public String treatment; // 治疗（treatment）
	@Reference
    public List<Target_CH> targets; // 靶点（targets）
    @MaxSize(50)
	public String drugbank;
	public String drugbank_link;
	@MaxSize(50)
	public String pubchem;
	public String pubchem_link;
	@MaxSize(50)
	public String kegg_compound;
	public String kegg_compound_link;
	@MaxSize(50)
	public String uniprot;
	public String uniprot_link;
	@MaxSize(50)
	public String omim;
	public String omim_link;
	@MaxSize(50)
	public String chebi;
	public String chebi_link;
	@MaxSize(50)
	public String biocyc;
	public String biocyc_link;
	@MaxSize(50)
	public String ctd;
	public String ctd_link;
	@MaxSize(50)
	public String stitch;
	public String stitch_link;
	@MaxSize(50)
	public String pdb;
	public String pdb_link;
	@MaxSize(50)
	public String actor;
	public String actor_link;
	@MaxSize(200)
	public String wikipedia;
	@MaxSize(50)
	public String supertoxic;
	@MaxSize(1000)
	public String reference;
	public Boolean isShow;
	@Required
	@Hidden
	public String auth;
	public SeaLife_CH(){}
	 public SeaLife_CH(Date created_at,
			 Date updated_at,
			 String title,
			 String common_name,
			 String description,
			 String type,
			 Blob img,
			 String img_link,
			 String synonyms,
			 String chemical_formula,
			 String weight,
			 String iupac,
			 String cas,
			 String inchi_identifier,
			 String inchi_key,
			 String smiles_isomeric,
			 String smiles_canonical,
			 String mol,
			 String organism,
			 String kingdom,
			 String super_class,
			 String class_,
			 String sub_class,
			 String direct_parent,
			 String alternative_parents,
			 String molecular_framework,
			 String substituents,
			 String external_descriptors,
			 String appearance,
			 String melting_point,
			 String boiling_point,
			 String density,
			 String flash_point,
			 String solubility,
			 String specific_gravity,
			 String vapour_pressure,
			 String predicted_logP,
			 String route_of_exposure,
			 String mechanism_of_action,
			 String interacting_proteins,
			 String metabolism,
			 String toxicity,
			 String lethaldose,
			 String carcinogenicity,
			 String use_source,
			 String min_risk_level,
			 String health_effects,
			 String symptoms,
			 String treatment,
			 String drugbank,
			 String drugbank_link,
			 String pubchem,
			 String pubchem_link,
			 String kegg_compound,
			 String kegg_compound_link,
			 String uniprot,
			 String uniprot_link,
			 String omim,
			 String omim_link,
			 String chebi,
			 String chebi_link,
			 String biocyc,
			 String biocyc_link,
			 String ctd,
			 String ctd_link,
			 String stitch,
			 String stitch_link,
			 String pdb,
			 String pdb_link,
			 String actor,
			 String actor_link,
			 String wikipedia,
			 String supertoxic,
			 String reference,
			 Boolean isShow,
			 String auth) {
		 this.title = title;
		 this.common_name = common_name;
		 this.description = description;
		 this.type = type;
		 this.img = img;
		 this.img_link = img_link;
		 this.synonyms = synonyms;
		 this.chemical_formula = chemical_formula;
		 this.weight = weight;
		 this.iupac = iupac;
		 this.cas = cas;
		 this.inchi_identifier = inchi_identifier;
		 this.inchi_key = inchi_key;
		 this.smiles_isomeric = smiles_isomeric;
		 this.smiles_canonical = smiles_canonical;
		 this.mol = mol;
		 this.organism = organism;
		 this.kingdom = kingdom;
		 this.super_class = super_class;
		 this.class_ = class_;
		 this.sub_class = sub_class;
		 this.direct_parent = direct_parent;
		 this.alternative_parents = alternative_parents;
		 this.molecular_framework = molecular_framework;
		 this.substituents = substituents;
		 this.external_descriptors = external_descriptors;
		 this.appearance = appearance;
		 this.melting_point = melting_point;
		 this.boiling_point = boiling_point;
		 this.density = density;
		 this.flash_point = flash_point;
		 this.solubility = solubility;
		 this.specific_gravity = specific_gravity;
		 this.vapour_pressure = vapour_pressure;
		 this.predicted_logP = predicted_logP;
		 this.route_of_exposure = route_of_exposure;
		 this.mechanism_of_action = mechanism_of_action;
		 this.interacting_proteins = interacting_proteins;
		 this.metabolism = metabolism;
		 this.toxicity = toxicity;
		 this.lethaldose = lethaldose;
		 this.carcinogenicity = carcinogenicity;
		 this.use_source = use_source;
		 this.min_risk_level = min_risk_level;
		 this.health_effects = health_effects;
		 this.symptoms = symptoms;
		 this.treatment = treatment;
		 this.drugbank = drugbank;
		 this.drugbank_link = drugbank_link;
		 this.pubchem = pubchem;
		 this.pubchem_link = pubchem_link;
		 this.kegg_compound = kegg_compound;
		 this.kegg_compound_link = kegg_compound_link;
		 this.uniprot = uniprot;
		 this.uniprot_link = uniprot_link;
		 this.omim = omim;
		 this.omim_link = omim_link;
		 this.chebi = chebi;
		 this.chebi_link = chebi_link;
		 this.biocyc = biocyc;
		 this.biocyc_link = biocyc_link;
		 this.ctd = ctd;
		 this.ctd_link = ctd_link;
		 this.stitch = stitch;
		 this.stitch_link = stitch_link;
		 this.pdb = pdb;
		 this.pdb_link = pdb_link;
		 this.actor = actor;
		 this.actor_link = actor_link;
		 this.wikipedia = wikipedia;
		 this.supertoxic = supertoxic;
		 this.reference = reference;
		 this.isShow = isShow;
		 this.auth = auth;
	    }
	
	public String toString() {
		return title;
	}


}