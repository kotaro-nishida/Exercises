
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[String,String,String,String,String,String,String,String,Form[Application.InputData],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name:String,pass:String,check:String,radio:String,select:String, area:String,date:String,num:String, inputData:Form[Application.InputData]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.142*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Froms")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

	<h1>Hello, Form!</h1>

	<p>これは、サンプルで作ったページです。</p>
	<p>"""),_display_(Seq[Any](/*8.6*/name)),_display_(Seq[Any](/*8.11*/pass)),_display_(Seq[Any](/*8.16*/check)),_display_(Seq[Any](/*8.22*/radio)),_display_(Seq[Any](/*8.28*/select)),_display_(Seq[Any](/*8.35*/area)),_display_(Seq[Any](/*8.40*/date)),_display_(Seq[Any](/*8.45*/num)),format.raw/*8.48*/("""</p>
	"""),_display_(Seq[Any](/*9.3*/helper/*9.9*/.form(action = routes.Application.send)/*9.48*/ {_display_(Seq[Any](format.raw/*9.50*/("""
	"""),_display_(Seq[Any](/*10.3*/(helper.inputText(inputData("name"),args = '_label -> "あたなの名前",'_help->"入力必須")))),format.raw/*10.82*/("""
	"""),_display_(Seq[Any](/*11.3*/(helper.inputPassword(inputData("passward"),'_label -> "パスワード")))),format.raw/*11.67*/("""
	"""),_display_(Seq[Any](/*12.3*/(helper.checkbox(inputData("check"))))),format.raw/*12.40*/("""
	"""),_display_(Seq[Any](/*13.3*/(helper.inputRadioGroup(inputData("radio"),options = Seq("windows"->"MS-Windows","mac"->"Mac OS X","linux"->"Linux"))))),format.raw/*13.121*/("""
	"""),_display_(Seq[Any](/*14.3*/(helper.select(inputData("select"),helper.options(("jp","日本"),("us","アメリカ"),("uk","イギリス")),'size -> "3")))),format.raw/*14.108*/("""
	"""),_display_(Seq[Any](/*15.3*/(helper.textarea(inputData("area"),'cols->50)))),format.raw/*15.49*/("""
	"""),_display_(Seq[Any](/*16.3*/(helper.inputDate(inputData("date"),'placeholder->"1999-01-11")))),format.raw/*16.67*/("""
	"""),_display_(Seq[Any](/*17.3*/(helper.inputText(inputData("num"),args = '_label->"inputNum",'type->"number",'size->10,'min->10,'max->100)))),format.raw/*17.111*/("""
	<input type = "submit">
	""")))})),format.raw/*19.3*/("""

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(name:String,pass:String,check:String,radio:String,select:String,area:String,date:String,num:String,inputData:Form[Application.InputData]): play.api.templates.HtmlFormat.Appendable = apply(name,pass,check,radio,select,area,date,num,inputData)
    
    def f:((String,String,String,String,String,String,String,String,Form[Application.InputData]) => play.api.templates.HtmlFormat.Appendable) = (name,pass,check,radio,select,area,date,num,inputData) => apply(name,pass,check,radio,select,area,date,num,inputData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 10 20:05:38 JST 2016
                    SOURCE: /Users/koutaroh.nishida/Forms/app/views/index.scala.html
                    HASH: a25d1893ab07c42ac129caf1da1770c17b5f8bf7
                    MATRIX: 851->1|1086->141|1123->144|1151->164|1190->166|1282->224|1316->229|1350->234|1385->240|1420->246|1456->253|1490->258|1524->263|1548->266|1589->273|1602->279|1649->318|1688->320|1726->323|1827->402|1865->405|1951->469|1989->472|2048->509|2086->512|2227->630|2265->633|2393->738|2431->741|2499->787|2537->790|2623->854|2661->857|2792->965|2851->993|2885->996
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15|44->16|44->16|45->17|45->17|47->19|49->21
                    -- GENERATED --
                */
            