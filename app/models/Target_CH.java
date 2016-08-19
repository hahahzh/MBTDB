package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;

@MongoEntity(value = "sealife_target_ch")
public class Target_CH extends MongoModel {

	
	public Date created_at_ch; // 在创造
	
	public Date updated_at_ch; // 更新
	@MaxSize(200)
	public String name_ch;//Name
	@MaxSize(50)
	public String uniprot_ch;//UniProt
	@MaxSize(1000)
	public String description_ch;//Description
	@MaxSize(1000)
	public String genesequence_ch;//Genesequence
	@MaxSize(1000)
	public String proteinsequence_ch;//Proteinsequence
	@MaxSize(50)
	public String gene_name_ch;//Gene Name
	@MaxSize(50)
	public String number_of_residues_ch;//Number of Residues
	@MaxSize(50)
	public String molecular_weight_ch;//Molecular Weight
	@MaxSize(50)
	public String theoretical_pi_ch;//Theoretical PI
	@MaxSize(1000)
	public String go_classification_ch;//GO Classification
	@MaxSize(200)
	public String general_function_ch;//General Function
	@MaxSize(100)
	public String domain_function_ch;//Domain Function
	@MaxSize(50)
	public String hgnc_id_ch;//Hgnc ID
	@MaxSize(200)
	public String cellular_location_ch;//Cellular Location
	@MaxSize(50)
	public String genbank_id_ch;//GenBank ID
	@MaxSize(500)
	public String pathway_ch;//Pathway
	@MaxSize(500)
	public String reaction_ch;//Reaction
	@MaxSize(500)
	public String signals_ch;//Signals
	@MaxSize(1000)
	public String transmembrane_regions_ch;//Transmembrane Regions
	@MaxSize(200)
	public String essentiality_ch;//Essentiality
	@MaxSize(50)
	public String pdb_id_ch;//PDB ID
	@MaxSize(50)
	public String genecard_id_ch;//GeneCard ID
	@MaxSize(50)
	public String genatlas_id_ch;//genatlas ID
	@MaxSize(50)
	public String genbank_id_gene_ch;//GenBank ID Gene
	@MaxSize(500)
	public String chromosome_location_ch;//Chromosome Location
	@MaxSize(1000)
	public String locus_ch;//Locus
	@Required
	public String auth_ch;
	public String toString() {
		return uniprot_ch;
	}

}