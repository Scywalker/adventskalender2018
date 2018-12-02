
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object image extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(date: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),_display_(/*5.2*/date/*5.6*/ match/*5.12*/{/*6.2*/case 1 =>/*6.11*/ {_display_(Seq[Any](format.raw/*6.13*/("""<img src=""""),_display_(/*6.24*/routes/*6.30*/.Assets.at("images/1.jpg")),format.raw/*6.56*/("""" />""")))}/*7.2*/case 2 =>/*7.11*/ {_display_(Seq[Any](format.raw/*7.13*/("""<img src=""""),_display_(/*7.24*/routes/*7.30*/.Assets.at("images/2.jpg")),format.raw/*7.56*/("""" />""")))}/*8.2*/case 3 =>/*8.11*/ {_display_(Seq[Any](format.raw/*8.13*/("""<img src=""""),_display_(/*8.24*/routes/*8.30*/.Assets.at("images/3.jpg")),format.raw/*8.56*/("""" />""")))}/*9.2*/case 4 =>/*9.11*/ {_display_(Seq[Any](format.raw/*9.13*/("""<img src=""""),_display_(/*9.24*/routes/*9.30*/.Assets.at("images/4.jpg")),format.raw/*9.56*/("""" />""")))}/*10.2*/case 5 =>/*10.11*/ {_display_(Seq[Any](format.raw/*10.13*/("""<img src=""""),_display_(/*10.24*/routes/*10.30*/.Assets.at("images/5.jpg")),format.raw/*10.56*/("""" />""")))}/*11.2*/case 6 =>/*11.11*/ {_display_(Seq[Any](format.raw/*11.13*/("""<video src=""""),_display_(/*11.26*/routes/*11.32*/.Assets.at("images/6.mp4")),format.raw/*11.58*/("""" controls></video>""")))}/*12.2*/case 7 =>/*12.11*/ {_display_(Seq[Any](format.raw/*12.13*/("""<img src=""""),_display_(/*12.24*/routes/*12.30*/.Assets.at("images/7.jpg")),format.raw/*12.56*/("""" />""")))}/*13.2*/case 8 =>/*13.11*/ {_display_(Seq[Any](format.raw/*13.13*/("""<img src=""""),_display_(/*13.24*/routes/*13.30*/.Assets.at("images/8.jpg")),format.raw/*13.56*/("""" />""")))}/*14.2*/case 9 =>/*14.11*/ {_display_(Seq[Any](format.raw/*14.13*/("""<img src=""""),_display_(/*14.24*/routes/*14.30*/.Assets.at("images/9.jpg")),format.raw/*14.56*/("""" />""")))}/*15.2*/case 10 =>/*15.12*/ {_display_(Seq[Any](format.raw/*15.14*/("""<img src=""""),_display_(/*15.25*/routes/*15.31*/.Assets.at("images/10.jpg")),format.raw/*15.58*/("""" />""")))}/*16.2*/case 11 =>/*16.12*/ {_display_(Seq[Any](format.raw/*16.14*/("""<img src=""""),_display_(/*16.25*/routes/*16.31*/.Assets.at("images/11.jpg")),format.raw/*16.58*/("""" />""")))}/*17.2*/case 12 =>/*17.12*/ {_display_(Seq[Any](format.raw/*17.14*/("""<video src=""""),_display_(/*17.27*/routes/*17.33*/.Assets.at("images/12.mp4")),format.raw/*17.60*/("""" controls></video>""")))}/*18.2*/case 13 =>/*18.12*/ {_display_(Seq[Any](format.raw/*18.14*/("""<img src=""""),_display_(/*18.25*/routes/*18.31*/.Assets.at("images/13.jpg")),format.raw/*18.58*/("""" />""")))}/*19.2*/case 14 =>/*19.12*/ {_display_(Seq[Any](format.raw/*19.14*/("""<img src=""""),_display_(/*19.25*/routes/*19.31*/.Assets.at("images/14.jpg")),format.raw/*19.58*/("""" />""")))}/*20.2*/case 15 =>/*20.12*/ {_display_(Seq[Any](format.raw/*20.14*/("""<img src=""""),_display_(/*20.25*/routes/*20.31*/.Assets.at("images/15.jpg")),format.raw/*20.58*/("""" />""")))}/*21.2*/case 16 =>/*21.12*/ {_display_(Seq[Any](format.raw/*21.14*/("""<img src=""""),_display_(/*21.25*/routes/*21.31*/.Assets.at("images/16.jpg")),format.raw/*21.58*/("""" />""")))}/*22.2*/case 17 =>/*22.12*/ {_display_(Seq[Any](format.raw/*22.14*/("""<img src=""""),_display_(/*22.25*/routes/*22.31*/.Assets.at("images/17.jpg")),format.raw/*22.58*/("""" />""")))}/*23.2*/case 18 =>/*23.12*/ {_display_(Seq[Any](format.raw/*23.14*/("""<img src=""""),_display_(/*23.25*/routes/*23.31*/.Assets.at("images/18.jpg")),format.raw/*23.58*/("""" />""")))}/*24.2*/case 19 =>/*24.12*/ {_display_(Seq[Any](format.raw/*24.14*/("""<img src=""""),_display_(/*24.25*/routes/*24.31*/.Assets.at("images/19.jpg")),format.raw/*24.58*/("""" />""")))}/*25.2*/case 20 =>/*25.12*/ {_display_(Seq[Any](format.raw/*25.14*/("""<img src=""""),_display_(/*25.25*/routes/*25.31*/.Assets.at("images/20.jpg")),format.raw/*25.58*/("""" />""")))}/*26.2*/case 21 =>/*26.12*/ {_display_(Seq[Any](format.raw/*26.14*/("""<img src=""""),_display_(/*26.25*/routes/*26.31*/.Assets.at("images/21.jpg")),format.raw/*26.58*/("""" />""")))}/*27.2*/case 22 =>/*27.12*/ {_display_(Seq[Any](format.raw/*27.14*/("""<video src=""""),_display_(/*27.27*/routes/*27.33*/.Assets.at("images/22.mp4")),format.raw/*27.60*/("""" controls></video>""")))}/*28.2*/case 23 =>/*28.12*/ {_display_(Seq[Any](format.raw/*28.14*/("""<img src=""""),_display_(/*28.25*/routes/*28.31*/.Assets.at("images/23.jpg")),format.raw/*28.58*/("""" />""")))}/*29.2*/case 24 =>/*29.12*/ {_display_(Seq[Any](format.raw/*29.14*/("""<img src=""""),_display_(/*29.25*/routes/*29.31*/.Assets.at("images/24.jpg")),format.raw/*29.58*/("""" />""")))}/*30.2*/case _ =>/*30.11*/ {_display_(Seq[Any](format.raw/*30.13*/("""<img src=""""),_display_(/*30.24*/routes/*30.30*/.Assets.at("images/1.jpg")),format.raw/*30.56*/("""" />""")))}}),format.raw/*31.2*/("""


""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(date:Int): play.twirl.api.HtmlFormat.Appendable = apply(date)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (date) => apply(date)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 01 01:01:38 CET 2018
                  SOURCE: C:/Users/LucasWeidner/Play/play-adventskalender/app/views/image.scala.html
                  HASH: 5ac00d5e490eeea008b0e428ddde0df42493de0a
                  MATRIX: 945->1|1050->13|1077->15|1124->54|1174->67|1202->70|1213->74|1227->80|1235->83|1252->92|1291->94|1328->105|1342->111|1388->137|1410->144|1427->153|1466->155|1503->166|1517->172|1563->198|1585->205|1602->214|1641->216|1678->227|1692->233|1738->259|1760->266|1777->275|1816->277|1853->288|1867->294|1913->320|1936->327|1954->336|1994->338|2032->349|2047->355|2094->381|2117->388|2135->397|2175->399|2215->412|2230->418|2277->444|2315->466|2333->475|2373->477|2411->488|2426->494|2473->520|2496->527|2514->536|2554->538|2592->549|2607->555|2654->581|2677->588|2695->597|2735->599|2773->610|2788->616|2835->642|2858->649|2877->659|2917->661|2955->672|2970->678|3018->705|3041->712|3060->722|3100->724|3138->735|3153->741|3201->768|3224->775|3243->785|3283->787|3323->800|3338->806|3386->833|3424->855|3443->865|3483->867|3521->878|3536->884|3584->911|3607->918|3626->928|3666->930|3704->941|3719->947|3767->974|3790->981|3809->991|3849->993|3887->1004|3902->1010|3950->1037|3973->1044|3992->1054|4032->1056|4070->1067|4085->1073|4133->1100|4156->1107|4175->1117|4215->1119|4253->1130|4268->1136|4316->1163|4339->1170|4358->1180|4398->1182|4436->1193|4451->1199|4499->1226|4522->1233|4541->1243|4581->1245|4619->1256|4634->1262|4682->1289|4705->1296|4724->1306|4764->1308|4802->1319|4817->1325|4865->1352|4888->1359|4907->1369|4947->1371|4985->1382|5000->1388|5048->1415|5071->1422|5090->1432|5130->1434|5170->1447|5185->1453|5233->1480|5271->1502|5290->1512|5330->1514|5368->1525|5383->1531|5431->1558|5454->1565|5473->1575|5513->1577|5551->1588|5566->1594|5614->1621|5637->1628|5655->1637|5695->1639|5733->1650|5748->1656|5795->1682|5831->1689|5865->1693
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|36->5|36->5|36->6|36->6|36->6|36->6|36->6|36->6|36->7|36->7|36->7|36->7|36->7|36->7|36->8|36->8|36->8|36->8|36->8|36->8|36->9|36->9|36->9|36->9|36->9|36->9|36->10|36->10|36->10|36->10|36->10|36->10|36->11|36->11|36->11|36->11|36->11|36->11|36->12|36->12|36->12|36->12|36->12|36->12|36->13|36->13|36->13|36->13|36->13|36->13|36->14|36->14|36->14|36->14|36->14|36->14|36->15|36->15|36->15|36->15|36->15|36->15|36->16|36->16|36->16|36->16|36->16|36->16|36->17|36->17|36->17|36->17|36->17|36->17|36->18|36->18|36->18|36->18|36->18|36->18|36->19|36->19|36->19|36->19|36->19|36->19|36->20|36->20|36->20|36->20|36->20|36->20|36->21|36->21|36->21|36->21|36->21|36->21|36->22|36->22|36->22|36->22|36->22|36->22|36->23|36->23|36->23|36->23|36->23|36->23|36->24|36->24|36->24|36->24|36->24|36->24|36->25|36->25|36->25|36->25|36->25|36->25|36->26|36->26|36->26|36->26|36->26|36->26|36->27|36->27|36->27|36->27|36->27|36->27|36->28|36->28|36->28|36->28|36->28|36->28|36->29|36->29|36->29|36->29|36->29|36->29|36->30|36->30|36->30|36->30|36->30|36->30|36->31|39->34
                  -- GENERATED --
              */
          