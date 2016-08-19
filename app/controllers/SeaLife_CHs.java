package controllers;


import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import models.SeaLife_CH;
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
public class SeaLife_CHs extends Controller {
	
	public static void wiki(String id) throws Exception {
//        ObjectType type = ObjectType.get(getControllerClass());
//        notFoundIfNull(type);
//        SeaLife_CH object = (SeaLife_CH)type.findById(id);
//        notFoundIfNull(object);
//        
//        if(StringUtil.isEmpty(object.title_ch))object.title_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.common_name_ch))object.common_name_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.description_ch))object.description_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.type_ch))object.type_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.synonyms_ch))object.synonyms_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.chemical_formula_ch))object.chemical_formula_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.weight_ch))object.weight_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.iupac_ch))object.iupac_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.cas_ch))object.cas_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.inchi_identifier_ch))object.inchi_identifier_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.inchi_key_ch))object.inchi_key_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.smiles_isomeric_ch))object.smiles_isomeric_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.smiles_canonical_ch))object.smiles_canonical_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.mol_ch))object.mol_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.organism_ch))object.organism_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.kingdom_ch))object.kingdom_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.super_class_ch))object.super_class_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.class_ch))object.class_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.sub_class_ch))object.sub_class_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.direct_parent_ch))object.direct_parent_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.alternative_parents_ch))object.alternative_parents_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.molecular_framework_ch))object.molecular_framework_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.substituents_ch))object.substituents_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.external_descriptors_ch))object.external_descriptors_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.appearance_ch))object.appearance_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.melting_point_ch))object.melting_point_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.boiling_point_ch))object.boiling_point_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.density_ch))object.density_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.flash_point_ch))object.flash_point_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.solubility_ch))object.solubility_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.specific_gravity_ch))object.specific_gravity_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.vapour_pressure_ch))object.vapour_pressure_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.predicted_logP))object.predicted_logP = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.route_of_exposure_ch))object.route_of_exposure_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.mechanism_of_action_ch))object.mechanism_of_action_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.interacting_proteins_ch))object.interacting_proteins_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.metabolism_ch))object.metabolism_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.toxicity_ch))object.toxicity_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.lethaldose_ch))object.lethaldose_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.carcinogenicity_ch))object.carcinogenicity_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.use_source_ch))object.use_source_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.min_risk_level_ch))object.min_risk_level_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.health_effects_ch))object.health_effects_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.symptoms_ch))object.symptoms_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.treatment_ch))object.treatment_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.drugbank_ch))object.drugbank_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.pubchem_ch))object.pubchem_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.kegg_compound_ch))object.kegg_compound_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.uniprot_ch))object.uniprot_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.omim_ch))object.omim_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.chebi_ch))object.chebi_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.biocyc_ch))object.biocyc_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.ctd_ch))object.ctd_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.stitch_ch))object.stitch_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.pdb_ch))object.pdb_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.actor_ch))object.actor_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.wikipedia_ch))object.wikipedia_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.supertoxic_ch))object.supertoxic_ch = MBTVariable.NotAvailable;
//        if(StringUtil.isEmpty(object.reference_ch))object.reference_ch = MBTVariable.NotAvailable;
//        
//        try {
//            render(type, object);
//        } catch (TemplateNotFoundException e) {
//            render("CRUD/show.html", type, object);
//        }
    }
	
	 public static void list(int page, String search, String searchFields, String orderBy, String order) {
//	        ObjectType type = ObjectType.get(getControllerClass());
//	        if(type == null)type = SeaLife_CHs.createObjectType(SeaLife_CH.class);
//	        notFoundIfNull(type);
//	        if (page < 1) {
//	            page = 1;
//	        }
//	        String role = session.get("admin_role");
//	        String where;
//	        if("3".equals(role)){
//	        	if(request.args.get("where") == null || "null".equals(request.args.get("where")) ||StringUtil.isEmpty((String)request.args.get("where")) ){
//		        	where = " isShow_ch=1";
//		        }else{
//		        	where = (String)request.args.get("where") + " isShow_ch=1";
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
//        SeaLife_CH object = (SeaLife_CH) constructor.newInstance();
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
//        object.auth_ch = session.get("admin_name");
//        object.updated_at_ch = new Date();
//        object.created_at_ch = new Date();
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
//        SeaLife_CH object = (SeaLife_CH)type.findById(id);
//        notFoundIfNull(object);
//        Binder.bindBean(params.getRootParamNode(), "object", object);
//        object.auth_ch = session.get("admin_name");
//        object.updated_at_ch = new Date();
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