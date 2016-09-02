package models;

import com.google.code.morphia.annotations.Entity;

import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.modules.morphia.Model;

@Entity(value = "roles")
public class Role extends Model {

	@Required
	@MaxSize(10)
	@MinSize(2)
	public String name;

	public String toString() {
		return name;
	}

}