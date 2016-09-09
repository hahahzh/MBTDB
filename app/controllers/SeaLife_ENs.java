package controllers;


import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.List;

import controllers.CRUD.ObjectType;
import models.SeaLife_EN;
import play.data.binding.Binder;
import play.db.Model;
import play.exceptions.TemplateNotFoundException;
import play.mvc.With;
import utils.MBTVariable;
import utils.StringUtil;

@Check("admin")
@With(Secure.class)
public class SeaLife_ENs extends CRUD {
	public static void wiki(String id) throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        SeaLife_EN object = (SeaLife_EN)type.findById(id);
        notFoundIfNull(object);
        
        if(StringUtil.isEmpty(object.title))object.title = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.common_name))object.common_name = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.description))object.description = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.type))object.type = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.synonyms))object.synonyms = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.chemical_formula))object.chemical_formula = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.weight))object.weight = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.iupac))object.iupac = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.cas))object.cas = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.inchi_identifier))object.inchi_identifier = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.inchi_key))object.inchi_key = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.smiles_isomeric))object.smiles_isomeric = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.smiles_canonical))object.smiles_canonical = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.mol))object.mol = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.organism))object.organism = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.kingdom))object.kingdom = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.super_class))object.super_class = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.class_))object.class_ = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.sub_class))object.sub_class = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.direct_parent))object.direct_parent = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.alternative_parents))object.alternative_parents = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.molecular_framework))object.molecular_framework = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.substituents))object.substituents = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.external_descriptors))object.external_descriptors = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.appearance))object.appearance = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.melting_point))object.melting_point = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.boiling_point))object.boiling_point = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.density))object.density = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.flash_point))object.flash_point = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.solubility))object.solubility = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.specific_gravity))object.specific_gravity = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.vapour_pressure))object.vapour_pressure = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.predicted_logP))object.predicted_logP = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.route_of_exposure))object.route_of_exposure = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.mechanism_of_action))object.mechanism_of_action = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.interacting_proteins))object.interacting_proteins = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.metabolism))object.metabolism = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.toxicity))object.toxicity = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.lethaldose))object.lethaldose = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.carcinogenicity))object.carcinogenicity = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.use_source))object.use_source = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.min_risk_level))object.min_risk_level = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.health_effects))object.health_effects = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.symptoms))object.symptoms = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.treatment))object.treatment = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.drugbank))object.drugbank = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.pubchem))object.pubchem = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.kegg_compound))object.kegg_compound = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.uniprot))object.uniprot = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.omim))object.omim = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.chebi))object.chebi = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.biocyc))object.biocyc = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.ctd))object.ctd = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.stitch))object.stitch = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.pdb))object.pdb = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.actor))object.actor = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.wikipedia))object.wikipedia = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.supertoxic))object.supertoxic = MBTVariable.NotAvailable;
        if(StringUtil.isEmpty(object.reference))object.reference = MBTVariable.NotAvailable;
        
        try {
            render(type, object);
        } catch (TemplateNotFoundException e) {
            render("CRUD/show.html", type, object);
        }
    }
	
	public static void list(int page, String search, String searchFields, String orderBy, String order) {
        ObjectType type = ObjectType.get(getControllerClass());
        if(type == null)type = SeaLife_ENs.createObjectType(SeaLife_EN.class);
        notFoundIfNull(type);
        if (page < 1) {
            page = 1;
        }
        String role = session.get("admin_role");
        String where;
        if("3".equals(role)){
        	if(request.args.get("where") == null || "null".equals(request.args.get("where")) ||StringUtil.isEmpty((String)request.args.get("where")) ){
	        	where = " isShow=true";
	        }else{
	        	where = (String)request.args.get("where") + " isShow=true";
	        }
        }else{
        	where = (String)request.args.get("where");
        }
        
        List<Model> objects = type.findPage(page, search, searchFields, orderBy, order, where);
        Long count = type.count(search, searchFields, where);
        Long totalCount = type.count(null, null, where);
        try {
            render(type, objects, count, totalCount, page, orderBy, order);
        } catch (TemplateNotFoundException e) {
            render("CRUD/list.html", type, objects, count, totalCount, page, orderBy, order);
        }
	}
	
	public static void save(String id) throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        SeaLife_EN object = (SeaLife_EN) type.findById(id);
        notFoundIfNull(object);
        Binder.bindBean(params.getRootParamNode(), "object", object);
        validation.valid(object);
        if (validation.hasErrors()) {
            renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
            try {
                render(request.controller.replace(".", "/") + "/show.html", type, object);
            } catch (TemplateNotFoundException e) {
                render("CRUD/show.html", type, object);
            }
        }
        object._modified = new Date().getTime();
        object.auth = session.get("admin_name");
        object._save();
        flash.success(play.i18n.Messages.get("crud.saved", type.modelName));
        if (params.get("_save") != null) {
            redirect(request.controller + ".list");
        }
        redirect(request.controller + ".show", object._key());
    }


    public static void create() throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Constructor<?> constructor = type.entityClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        SeaLife_EN object = (SeaLife_EN) constructor.newInstance();
        Binder.bindBean(params.getRootParamNode(), "object", object);
        object.auth = session.get("admin_name");
        object._created = new Date().getTime();
        object._modified = new Date().getTime();
        validation.valid(object);
        if (validation.hasErrors()) {
            renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
            try {
                render(request.controller.replace(".", "/") + "/blank.html", type, object);
            } catch (TemplateNotFoundException e) {
                render("CRUD/blank.html", type, object);
            }
        }
        object._save();
        flash.success(play.i18n.Messages.get("crud.created", type.modelName));
        if (params.get("_save") != null) {
            redirect(request.controller + ".list");
        }
        if (params.get("_saveAndAddAnother") != null) {
            redirect(request.controller + ".blank");
        }
        redirect(request.controller + ".show", object._key());
    }
}