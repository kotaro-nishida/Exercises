package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static Result index(String msg,int id){
		return ok(index.render("引数は、" + msg + "," + id + "です。"));
    }


	public static Result redirect(){
		String msg = "";
		int i = 0;
		return redirect(controllers.routes.Application.index(msg,i));
	}

}
