package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.SeaLife_CH;
import models.SeaLife_EN;
import models.Target_CH;
import models.Target_EN;
import play.data.validation.Required;
import play.data.validation.Validation;
import play.mvc.Controller;

public class Application extends Controller {

    public static void dataUpload() {
        render("Application/dataupload.html");
    }
    
    public static void dp(Integer lang, Integer type, @Required String auth, @Required File datafile) {
    	if (Validation.hasErrors()) {
			renderText("error_parameter_required");
		}
    	 StringBuilder sb = new StringBuilder();
         
         BufferedReader br=null;
         try { 
             br = new BufferedReader(new FileReader(datafile));
             String line = ""; 
             while ((line = br.readLine()) != null) {
            	 sb.append(line);
             }
         	List<String> l = new ArrayList<String>();
        	int start = 0;
        	
        	int end = 0;
        	do{
        		end = sb.toString().indexOf("end.");
            	l.add(sb.toString().substring(start, end+4));
            	String tmp = sb.toString().substring(end+4);
            	sb.delete( 0, sb.length() );
            	sb.append(tmp);
        	}while(sb.toString().length()>0);
            if(type == null || type == 1)toxins(lang, l, auth);
            else if(type == 2) targets(lang, l, auth);
            renderText("successed");
         }catch (Exception e) {
        	 e.printStackTrace();
         }finally{
             if(br!=null){
                 try {
                     br.close();
                     br=null;
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }
    }
    
    private static void toxins(Integer lang, List<String> l, String auth){
    	long n=0;
    	for(String s: l){
    		if(lang == 1){
    			SeaLife_CH slc = new SeaLife_CH();
        		slc._save();
    		}else{
    			SeaLife_EN sle = new SeaLife_EN();
        		sle._save();
    		}
    		
    	}
    	play.Logger.error("Insert the toxins data "+n+", and auth is "+auth+", and lang is "+lang);
    }
    
    private static void targets(Integer lang, List<String> l, String auth){
    	long n=0;
    	for(String s: l){
    		n++;
    		String[] sArray = s.split(",");
    		if(lang == 1){
    			Target_CH slc = new Target_CH();
    			slc._created=new Date(sArray[1]).getTime();
    			slc._modified=new Date(sArray[2]).getTime();
    			slc.uniprot=sArray[3];
    			slc.description=sArray[4];
    			slc.genesequence=sArray[5];
    			slc.proteinsequence=sArray[6];
    			slc.gene_name=sArray[7];
    			slc.synonyms=sArray[8];
    			slc.number_of_residues=sArray[9];
    			slc.molecular_weight=sArray[10];
    			slc.theoretical_pi=sArray[11];
    			slc.go_classification=sArray[12];
    			slc.general_function=sArray[13];
    			slc.domain_function=sArray[14];
    			slc.hgnc_id=sArray[15];
    			slc.cellular_location=sArray[16];
    			slc.genbank_id=sArray[17];
    			slc.pathway=sArray[18];
    			slc.reaction=sArray[19];
    			slc.signals=sArray[20];
    			slc.transmembrane_regions=sArray[21];
    			slc.essentiality=sArray[22];
    			slc.pdb_id=sArray[23];
    			slc.genecard_id=sArray[24];
    			slc.genatlas_id=sArray[25];
    			slc.genbank_id_gene=sArray[26];
    			slc.chromosome_location=sArray[27];
    			slc.locus=sArray[28];
    			slc.auth = auth;
    			slc._save();
    		}else{
    			Target_EN sle = new Target_EN();
    			sle.name=sArray[0];
    			sle._created=new Date(sArray[1]).getTime();
    			sle._modified=new Date(sArray[2]).getTime();
    			sle.uniprot=sArray[3];
    			sle.description=sArray[4];
    			sle.genesequence=sArray[5];
    			sle.proteinsequence=sArray[6];
    			sle.gene_name=sArray[7];
    			sle.synonyms=sArray[8];
    			sle.number_of_residues=sArray[9];
    			sle.molecular_weight=sArray[10];
    			sle.theoretical_pi=sArray[11];
    			sle.go_classification=sArray[12];
    			sle.general_function=sArray[13];
    			sle.domain_function=sArray[14];
    			sle.hgnc_id=sArray[15];
    			sle.cellular_location=sArray[16];
    			sle.genbank_id=sArray[17];
    			sle.pathway=sArray[18];
    			sle.reaction=sArray[19];
    			sle.signals=sArray[20];
    			sle.transmembrane_regions=sArray[21];
    			sle.essentiality=sArray[22];
    			sle.pdb_id=sArray[23];
    			sle.genecard_id=sArray[24];
    			sle.genatlas_id=sArray[25];
    			sle.genbank_id_gene=sArray[26];
    			sle.chromosome_location=sArray[27];
    			sle.locus=sArray[28];
    			sle.auth = auth;
        		sle._save();
    		}
    		sArray = null;
    	}
    	play.Logger.error("Insert the targets data "+n+", and auth is "+auth+", and lang is "+lang);
    }
	
	public static void index() {
        render("CRUD/index.html");
    }

    public static void list() {
        render();
    }
    
    public static void setLang(String lang) {    
        Lang.change(lang);
        if("3".equals(session.get("admin_role"))){
        	if("zh".equals(lang))SeaLife_CHs.list(0, null, null, null, null);
        	if("en".equals(lang))SeaLife_ENs.list(0, null, null, null, null);
        }
        
    	index();
    }
}