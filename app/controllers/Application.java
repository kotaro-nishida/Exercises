package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import static play.data.Form.*;

public class Application extends Controller {

	public static class InputData {
	    public String name = "";
	    public String passward = "";
	    public String check = "";
	    public String radio = "";
	    public String select = "";
	    public String area = "";
	    public String date = "";
	    public String num = "";
	  }

    public static Result index() {
    	Form<InputData> inputForm = form(InputData.class).bindFromRequest();
    	if (!inputForm.hasErrors()) {
    		InputData data = inputForm.get();
            String msg = "名前：" + data.name;
            String pass = "パスワード："+data.passward;
            String check = "check："+data.check;
            String radio = "radio："+data.radio;
            String select = "select："+data.select;
            String area = "area："+data.area;
            String date = "date："+data.date;
            String num = "num："+data.num;
            data.name = "default value";
            data.passward = "";
            data.check = "true";
            data.radio = "mac";
            data.select = "uk";
            data.area = "";
            data.date = "";
            data.num = "50";
            return ok(index.render("","","","","","","","", inputForm));
            }

    	return ok(index.render("","","","","","","","",new Form(InputData.class)));
    }

    public static Result send(){
    	Form<InputData> inputForm = form(InputData.class).bindFromRequest();
    	if (!inputForm.hasErrors()) {
    		InputData data = inputForm.get();
            String msg = "名前：" + data.name+",";
            String pass = "パスワード:"+data.passward+",";
            String check = "check:"+data.check+",";
            String radio = "radio:"+data.radio+",";
            String select = "select:"+data.select+",";
            String area = "area:"+data.area+",";
            String date = "date:"+data.date+",";
            String num = "num:"+data.num;
            return ok(index.render(msg,pass,check,radio,select,area,date,num, inputForm));
            }
    	return ok(index.render("","","","","","","","",inputForm));
    }

}
