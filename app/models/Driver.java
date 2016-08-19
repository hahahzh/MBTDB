package models;

import java.util.Date;

import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;
@MongoEntity
public class Driver extends MongoModel {
	
	public String name;
	public Date dob;

	public Driver(){
		
	}

	public Driver(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}
	
	

}
