package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;

@MongoEntity(value = "sealife_target_en")
public class Target_EN extends MongoModel {

	
	public Date created_at_en; // 在创造
	
	public Date updated_at_en; // 更新
	@MaxSize(200)
	public String name_en;//Name
	@MaxSize(50)
	public String uniprot_en;//UniProt
	@MaxSize(1000)
	public String description_en;//Description
	@MaxSize(1000)
	public String genesequence_en;//Genesequence
	@MaxSize(1000)
	public String proteinsequence_en;//Proteinsequence
	@MaxSize(50)
	public String gene_name_en;//Gene Name
	@MaxSize(50)
	public String number_of_residues_en;//Number of Residues
	@MaxSize(50)
	public String molecular_weight_en;//Molecular Weight
	@MaxSize(50)
	public String theoretical_pi_en;//Theoretical PI
	@MaxSize(1000)
	public String go_classification_en;//GO Classification
	@MaxSize(200)
	public String general_function_en;//General Function
	@MaxSize(100)
	public String domain_function_en;//Domain Function
	@MaxSize(50)
	public String hgnc_id_en;//Hgnc ID
	@MaxSize(200)
	public String cellular_location_en;//Cellular Location
	@MaxSize(50)
	public String genbank_id_en;//GenBank ID
	@MaxSize(500)
	public String pathway_en;//Pathway
	@MaxSize(500)
	public String reaction_en;//Reaction
	@MaxSize(500)
	public String signals_en;//Signals
	@MaxSize(1000)
	public String transmembrane_regions_en;//Transmembrane Regions
	@MaxSize(200)
	public String essentiality_en;//Essentiality
	@MaxSize(50)
	public String pdb_id_en;//PDB ID
	@MaxSize(50)
	public String genecard_id_en;//GeneCard ID
	@MaxSize(50)
	public String genatlas_id_en;//genatlas ID
	@MaxSize(50)
	public String genbank_id_gene_en;//GenBank ID Gene
	@MaxSize(500)
	public String chromosome_location_en;//Chromosome Location
	@MaxSize(1000)
	public String locus_en;//Locus
	@Required
	public String auth_en;
	public String toString() {
		return uniprot_en;
	}

}