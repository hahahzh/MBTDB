package controllers;


import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import models.SeaLife_EN;
import play.data.binding.Binder;
import play.db.Model;
import play.db.jpa.Blob;
import play.exceptions.TemplateNotFoundException;
import play.mvc.Controller;
import play.mvc.With;
import utils.MBTVariable;
import utils.StringUtil;

@Check("admin")
@With(Secure.class)
public class SeaLife_ENs extends Controller {
	
	public static void wiki(String id) throws Exception {
//        ObjectType type = ObjectType.get(getControllerClass());
//        notFoundIfNull(type);
//        SeaLife_EN object = (SeaLife_EN)type.findById(id);
//        notFoundIfNull(object);
//        
//        if(StringUtil.isEmpty(object.title_en))object.title_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.common_name_en))object.common_name_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.description_en))object.description_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.type_en))object.type_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.synonyms_en))object.synonyms_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.chemical_formula_en))object.chemical_formula_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.weight_en))object.weight_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.iupac_en))object.iupac_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.cas_en))object.cas_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.inchi_identifier_en))object.inchi_identifier_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.inchi_key_en))object.inchi_key_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.smiles_isomeric_en))object.smiles_isomeric_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.smiles_canonical_en))object.smiles_canonical_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.mol_en))object.mol_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.organism_en))object.organism_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.kingdom_en))object.kingdom_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.super_class_en))object.super_class_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.class_en))object.class_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.sub_class_en))object.sub_class_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.direct_parent_en))object.direct_parent_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.alternative_parents_en))object.alternative_parents_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.molecular_framework_en))object.molecular_framework_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.substituents_en))object.substituents_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.external_descriptors_en))object.external_descriptors_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.appearance_en))object.appearance_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.melting_point_en))object.melting_point_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.boiling_point_en))object.boiling_point_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.density_en))object.density_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.flash_point_en))object.flash_point_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.solubility_en))object.solubility_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.specific_gravity_en))object.specific_gravity_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.vapour_pressure_en))object.vapour_pressure_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.predicted_logP))object.predicted_logP = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.route_of_exposure_en))object.route_of_exposure_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.mechanism_of_action_en))object.mechanism_of_action_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.interacting_proteins_en))object.interacting_proteins_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.metabolism_en))object.metabolism_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.toxicity_en))object.toxicity_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.lethaldose_en))object.lethaldose_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.carcinogenicity_en))object.carcinogenicity_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.use_source_en))object.use_source_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.min_risk_level_en))object.min_risk_level_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.health_effects_en))object.health_effects_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.symptoms_en))object.symptoms_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.treatment_en))object.treatment_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.drugbank_en))object.drugbank_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.pubchem_en))object.pubchem_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.kegg_compound_en))object.kegg_compound_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.uniprot_en))object.uniprot_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.omim_en))object.omim_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.chebi_en))object.chebi_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.biocyc_en))object.biocyc_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.ctd_en))object.ctd_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.stitch_en))object.stitch_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.pdb_en))object.pdb_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.actor_en))object.actor_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.wikipedia_en))object.wikipedia_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.supertoxic_en))object.supertoxic_en = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.reference_en))object.reference_en = MBTVariable.NotAvailable;
//        
//        try {
//            render(type, object);
//        } catch (TemplateNotFoundException e) {
//            render("CRUD/show.html", type, object);
//        }
    }
	
	 public static void list(int page, String search, String searchFields, String orderBy, String order) {
//	        ObjectType type = ObjectType.get(getControllerClass());
//	        if(type == null)type = SeaLife_ENs.createObjectType(SeaLife_EN.class);
//	        notFoundIfNull(type);
//	        if (page < 1) {
//	            page = 1;
//	        }
//	        String role = session.get("admin_role");
//	        String where;
//	        if("3".equals(role)){
//	        	if(request.args.get("where") == null || "null".equals(request.args.get("where")) ||StringUtil.isEmpty((String)request.args.get("where")) ){
//		        	where = " isShow_en=1";
//		        }else{
//		        	where = (String)request.args.get("where") + " isShow_en=1";
//		        }
//	        }else{
//	        	where = (String)request.args.get("where");
//	        }
//	         
//	        List<Model> objects = type.findPage(page, search, searchFields, orderBy, order, where);
//	        Long count = type.count(search, searchFields, where);
//	        Long totalCount = type.count(null, null, where);
//	        try {
//	            render(type, objects, count, totalCount, page, orderBy, order);
//	        } catch (TemplateNotFoundException e) {
//	            render("CRUD/list.html", type, objects, count, totalCount, page, orderBy, order);
//	        }
	 }
	 
	public static void create() throws Exception {
//        ObjectType type = ObjectType.get(getControllerClass());
//        notFoundIfNull(type);
//        Constructor<?> constructor = type.entityClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SeaLife_EN object = (SeaLife_EN) constructor.newInstance();
//        Binder.bindBean(params.getRootParamNode(), "object", object);
//        Set<String> s =params.data.keySet();
//        Iterator<String> i = s.iterator();
//        while(i.hasNext()){
//        	String name = i.next();
//        	if(name.contains("_hiddenblob")){
//        		String[] tmpParam = params.get(name).split(",");
//        		if(tmpParam.length == 2 && !tmpParam[0].equals("null")){
//                	Blob tmp = new Blob();
//                	tmp.set(new FileInputStream(tmpParam[0]), tmpParam[1]);
//                	name = name.replace("_hiddenblob", "").replace("object.", "");
//                	object.getClass().getField(name).set(object, tmp);
//        		}
//        	}
//        }
//        object.auth_en = session.get("admin_name");
//        object.updated_at_en = new Date();
//        object.created_at_en = new Date();
//        validation.valid(object);
//        if (validation.hasErrors()) {
//            renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
//            try {
//                render(request.controller.replace(".", "/") + "/blank.html", type, object);
//            } catch (TemplateNotFoundException e) {
//                render("CRUD/blank.html", type, object);
//            }
//        }
//        object._save();
//        flash.success(play.i18n.Messages.get("crud.created", type.modelName));
//        if (params.get("_save") != null) {
//            redirect(request.controller + ".list");
//        }
//        if (params.get("_saveAndAddAnother") != null) {
//            redirect(request.controller + ".blank");
//        }
//        redirect(request.controller + ".show", object._key());
    }
	
	public static void save(String id) throws Exception {
//        ObjectType type = ObjectType.get(getControllerClass());
//        notFoundIfNull(type);
//        SeaLife_EN object = (SeaLife_EN)type.findById(id);
//        notFoundIfNull(object);
//        Binder.bindBean(params.getRootParamNode(), "object", object);
//        object.auth_en = session.get("admin_name");
//        object.updated_at_en = new Date();
//        validation.valid(object);
//        if (validation.hasErrors()) {
//            renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
//            try {
//                render(request.controller.replace(".", "/") + "/show.html", type, object);
//            } catch (TemplateNotFoundException e) {
//                render("CRUD/show.html", type, object);
//            }
//        }
//        object._save();
//        flash.success(play.i18n.Messages.get("crud.saved", type.modelName));
//        if (params.get("_save") != null) {
//            redirect(request.controller + ".list");
//        }
//        redirect(request.controller + ".show", object._key());
    }
}