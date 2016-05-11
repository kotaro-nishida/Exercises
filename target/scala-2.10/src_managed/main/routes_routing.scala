// @SOURCE:/Users/koutaroh.nishida/ViewConApp/conf/routes
// @HASH:ea1ad91a56479cfbdb12da4e5368f3d97a6dca0c
// @DATE:Mon May 09 15:49:01 JST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index/"),DynamicPart("msg", """[^/]+""",true),StaticPart("/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Application_redirect2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("redirect"))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index/$msg<[^/]+>/$id<[^/]+>""","""controllers.Application.index(msg:String, id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """redirect""","""controllers.Application.redirect()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call(params.fromPath[String]("msg", None), params.fromPath[Int]("id", None)) { (msg, id) =>
        invokeHandler(controllers.Application.index(msg, id), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String], classOf[Int]),"GET", """ Home page""", Routes.prefix + """index/$msg<[^/]+>/$id<[^/]+>"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Application_redirect2(params) => {
   call { 
        invokeHandler(controllers.Application.redirect(), HandlerDef(this, "controllers.Application", "redirect", Nil,"GET", """""", Routes.prefix + """redirect"""))
   }
}
        
}

}
     