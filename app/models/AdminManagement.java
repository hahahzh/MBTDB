package models;

import java.util.Date;

import play.data.binding.As;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.modules.morphia.Model;
import utils.DateUtil;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

import controllers.CRUD.Hidden;

@Entity(value="admin")
public class AdminManagement extends Model {

	
	@Hidden
	public Long _created;
	@Hidden
	public Long _modified;
	@Required
	@MaxSize(value = 20)
	@MinSize(value = 6)
	public String name;

	@Required
	@Password
	@MaxSize(value = 10)
	@MinSize(value = 6)
	public String pwd;
	@Required
	@Reference
	public Role role;
	@Hidden
	public String auth;


	 public AdminManagement(String name, String password, Role role, String auth) {
	        this.name = name;
	        this.role = role;
	        this.pwd = password;
	        this.auth = auth;
	    }
	 
    public static AdminManagement findByUandP(String name, String pwd) {
        return find("byNameAndPwd", name, pwd).first();
    }
	    
	public String toString() {
		return name;
	}

}