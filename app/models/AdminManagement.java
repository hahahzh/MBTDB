package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;

@MongoEntity(value = "appadmin")
public class AdminManagement extends MongoModel {

	@Required
	@MaxSize(15)
	@MinSize(3)
	public String name;

	@Required
	@MaxSize(15)
	@MinSize(6)
	@Password
	public String pwd;
	
	@Required
	@ManyToOne(fetch=FetchType.LAZY,cascade=javax.persistence.CascadeType.REFRESH, optional = true)
	public Role role;
	
	public String auth;

	public String toString() {
		return name;
	}

}