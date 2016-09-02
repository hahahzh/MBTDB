package models;

import java.util.Date;

import com.google.code.morphia.annotations.Entity;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.modules.morphia.Model;


@Entity(value = "sealife_target_en")
public class Target_EN extends Model {

	
	public Date created_at; // 在创造
	
	public Date updated_at; // 更新
	
	public String name;//Name
	
	public String uniprot;//UniProt
	
	public String description;//Description
	
	public String genesequence;//Genesequence
	
	public String proteinsequence;//Proteinsequence
	
	public String gene_name;//Gene Name
	
	public String number_of_residues;//Number of Residues
	
	public String molecular_weight;//Molecular Weight
	
	public String theoretical_pi;//Theoretical PI
	
	public String go_classification;//GO Classification
	
	public String general_function;//General Function
	
	public String domain_function;//Domain Function
	
	public String hgnc_id;//Hgnc ID
	
	public String cellular_location;//Cellular Location
	
	public String genbank_id;//GenBank ID
	
	public String pathway;//Pathway
	
	public String reaction;//Reaction
	
	public String signals;//Signals
	
	public String transmembrane_regions;//Transmembrane Regions
	
	public String essentiality;//Essentiality
	
	public String pdb_id;//PDB ID
	
	public String genecard_id;//GeneCard ID
	
	public String genatlas_id;//genatlas ID
	
	public String genbank_id_gene;//GenBank ID Gene
	
	public String chromosome_location;//Chromosome Location
	
	public String locus;//Locus
	@Required
	public String auth;
	
	public Target_EN(Date created_at,
			Date updated_at,
			String name,
			String uniprot,
			String description,
			String genesequence,
			String proteinsequence,
			String gene_name,
			String number_of_residues,
			String molecular_weight,
			String theoretical_pi,
			String go_classification,
			String general_function,
			String domain_function,
			String hgnc_id,
			String cellular_location,
			String genbank_id,
			String pathway,
			String reaction,
			String signals,
			String transmembrane_regions,
			String essentiality,
			String pdb_id,
			String genecard_id,
			String genatlas_id,
			String genbank_id_gene,
			String chromosome_location,
			String locus,
			String auth){
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.name = name;
		this.uniprot = uniprot;
		this.description = description;
		this.genesequence = genesequence;
		this.proteinsequence = proteinsequence;
		this.gene_name = gene_name;
		this.number_of_residues = number_of_residues;
		this.molecular_weight = molecular_weight;
		this.theoretical_pi = theoretical_pi;
		this.go_classification = go_classification;
		this.general_function = general_function;
		this.domain_function = domain_function;
		this.hgnc_id = hgnc_id;
		this.cellular_location = cellular_location;
		this.genbank_id = genbank_id;
		this.pathway = pathway;
		this.reaction = reaction;
		this.signals = signals;
		this.transmembrane_regions = transmembrane_regions;
		this.essentiality = essentiality;
		this.pdb_id = pdb_id;
		this.genecard_id = genecard_id;
		this.genatlas_id = genatlas_id;
		this.genbank_id_gene = genbank_id_gene;
		this.chromosome_location = chromosome_location;
		this.locus = locus;
		this.auth = auth;
	}
	
	public String toString() {
		return uniprot;
	}

}