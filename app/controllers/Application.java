package controllers;

import play.i18n.Lang;
import play.mvc.Controller;

public class Application extends Controller {

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