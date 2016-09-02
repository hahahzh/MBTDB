package controllers;

import play.i18n.Lang;
import utils.StringUtil;
import models.AdminManagement;


public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {

		if(AdminManagement.count() == 0){
			session.put("admin_id", "1");
			session.put("admin_name", "admin");
			session.put("admin_role", 1);
			return "admin".equals(username)&&"admin".equals(password);
		}
    	//初始化状态
		AdminManagement user = AdminManagement.find("byName", username).first();
		
		boolean flag = false;
		if(user != null && user.pwd.equals(password)){
			session.put("admin_id", user.getIdAsStr());
			session.put("admin_name", user.name);
			session.put("admin_role", user.role.getIdAsStr());
			flag = true;
		}
		return flag;
   	}

    static void onDisconnected() {
        render();
    }

    static void onAuthenticated() {
    	String tmp = Lang.getLocale().getLanguage();
    	if(!StringUtil.isEmpty(tmp)){
    		if("3".equals(session.get("admin_role"))){
    			if("zh".equals(tmp))SeaLife_CHs.list(0, null, null, null, null);
    			if("en".equals(tmp))SeaLife_ENs.list(0, null, null, null, null);
    		}
    	}
    	render();
    }
}

