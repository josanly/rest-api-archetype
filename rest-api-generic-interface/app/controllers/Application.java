package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	public static final String APP_NAME = Play.application().configuration().getString("app.name");
	public static final String APP_VERSION = Play.application().configuration().getString("app.version");

	public static final String TITLE = APP_NAME.toUpperCase();
	public static final String SUB_TITLE = "a REST API to provide data and/or services";
	
    public static Result index() {
        return ok(views.html.index.render(TITLE, SUB_TITLE, "home"));
    }
  
    public static Result documentation() {
        return ok(views.html.documentation.render(TITLE, SUB_TITLE, "api-doc"));
    }
    
    public static Result about() {
        return ok(views.html.about.render(TITLE, SUB_TITLE, APP_NAME, APP_VERSION, "about"));
    }
}
