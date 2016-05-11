// @SOURCE:/Users/koutaroh.nishida/ViewConApp/conf/routes
// @HASH:ea1ad91a56479cfbdb12da4e5368f3d97a6dca0c
// @DATE:Mon May 09 15:49:01 JST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def redirect(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "redirect")
}
                                                

// @LINE:6
def index(msg:String, id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index/" + implicitly[PathBindable[String]].unbind("msg", dynamicString(msg)) + "/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          
}
                  


// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def redirect : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirect",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirect"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(msg,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("msg", encodeURIComponent(msg)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def redirect(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirect(), HandlerDef(this, "controllers.Application", "redirect", Seq(), "GET", """""", _prefix + """redirect""")
)
                      

// @LINE:6
def index(msg:String, id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(msg, id), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String], classOf[Int]), "GET", """ Home page""", _prefix + """index/$msg<[^/]+>/$id<[^/]+>""")
)
                      
    
}
                          
}
        
    