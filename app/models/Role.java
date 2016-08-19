package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;

@MongoEntity(value = "roles")
public class Role extends MongoModel {

	@Required
	@MaxSize(10)
	@MinSize(2)
	public String name;

	public String toString() {
		return name;
	}

}