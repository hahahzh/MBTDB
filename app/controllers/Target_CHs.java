package controllers;


import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import models.Target_CH;
import play.data.binding.Binder;
import play.db.jpa.Blob;
import play.exceptions.TemplateNotFoundException;
import play.mvc.Controller;
import play.mvc.With;

@Check("admin")
@With(Secure.class)
public class Target_CHs extends CRUD {

	
}