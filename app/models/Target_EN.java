package models;

import java.util.Date;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.modules.morphia.Model;

import com.google.code.morphia.annotations.Entity;

import controllers.CRUD.Hidden;
@Entity(value = "sealife_target_en")
public class Target_EN extends Model {

	
	@Hidden
	public Long _created;
	@Hidden
	public Long _modified;
	@Required
	@MaxSize(200)
	public String name;//Name
	@Required
	@MaxSize(50)
	public String uniprot;//UniProt
	@MaxSize(2000)
	public String description;//Description
	@MaxSize(2000)
	public String genesequence;//Genesequence
	@MaxSize(2000)
	public String proteinsequence;//Proteinsequence
	@MaxSize(100)
	public String gene_name;//Gene Name
	@MaxSize(3000)
	public String synonyms;
	@MaxSize(100)
	public String number_of_residues;//Number of Residues
	@MaxSize(100)
	public String molecular_weight;//Molecular Weight
	@MaxSize(100)
	public String theoretical_pi;//Theoretical PI
	@MaxSize(2000)
	public String go_classification;//GO Classification
	@MaxSize(500)
	public String general_function;//General Function
	@MaxSize(200)
	public String domain_function;//Domain Function
	@MaxSize(100)
	public String hgnc_id;//Hgnc ID
	@MaxSize(500)
	public String cellular_location;//Cellular Location
	@MaxSize(100)
	public String genbank_id;//GenBank ID
	@MaxSize(1000)
	public String pathway;//Pathway
	@MaxSize(1000)
	public String reaction;//Reaction
	@MaxSize(1000)
	public String signals;//Signals
	@MaxSize(2000)
	public String transmembrane_regions;//Transmembrane Regions
	@MaxSize(500)
	public String essentiality;//Essentiality
	@MaxSize(100)
	public String pdb_id;//PDB ID
	@MaxSize(100)
	public String genecard_id;//GeneCard ID
	@MaxSize(100)
	public String genatlas_id;//genatlas ID
	@MaxSize(100)
	public String genbank_id_gene;//GenBank ID Gene
	@MaxSize(1000)
	public String chromosome_location;//Chromosome Location
	@MaxSize(2000)
	public String locus;//Locus
	@Required
	@Hidden
	public String auth;
	public Target_EN(){}
	public Target_EN(Long created_at,
			Long updated_at,
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
		this._created = created_at;
		this._modified = updated_at;
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