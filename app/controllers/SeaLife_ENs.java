package controllers;


import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import models.SeaLife_EN;
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
public class SeaLife_ENs extends CRUD {
	
}