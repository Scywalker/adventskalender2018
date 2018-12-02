
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

object calendar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Adventskalender 2018</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*5.59*/routes/*5.65*/.Assets.at("images/favicon.png")),format.raw/*5.97*/("""">
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*7.48*/routes/*7.54*/.Assets.at("bootstrap/css/bootstrap.css")),format.raw/*7.95*/("""">
		<!--
		<script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"></script>
		<script type="text/javascript" src=""""),_display_(/*10.40*/routes/*10.46*/.Assets.at("bootstrap/js/bootstrap.js")),format.raw/*10.85*/(""""></script>-->
		<link rel="stylesheet" media="screen" href=""""),_display_(/*11.48*/routes/*11.54*/.Assets.at("stylesheets/calendar.css")),format.raw/*11.92*/("""">
    </head>
    <body background=""""),_display_(/*13.24*/routes/*13.30*/.Assets.at("images/Adventskalendar.jpg")),format.raw/*13.70*/("""" background-size="cover">
        <h1>Adventskalender 2018</h1>
		<br><br><br><br>
		<div class="container">
			<div class="row">
			  <div class="span2"><a href=""""),_display_(/*18.35*/controllers/*18.46*/.routes.ImageController.showImage(15)),format.raw/*18.83*/("""">15</a></div>
			  <div class="span2"><a href=""""),_display_(/*19.35*/controllers/*19.46*/.routes.ImageController.showImage(8)),format.raw/*19.82*/("""">8</a></div>
			  <div class="span2"><a href=""""),_display_(/*20.35*/controllers/*20.46*/.routes.ImageController.showImage(20)),format.raw/*20.83*/("""">20</a></div>
			  <div class="span2"><a href=""""),_display_(/*21.35*/controllers/*21.46*/.routes.ImageController.showImage(3)),format.raw/*21.82*/("""">3</a></div>
			  <div class="span2"><a href=""""),_display_(/*22.35*/controllers/*22.46*/.routes.ImageController.showImage(11)),format.raw/*22.83*/("""">11</a></div>
			  <div class="span2"><a href=""""),_display_(/*23.35*/controllers/*23.46*/.routes.ImageController.showImage(22)),format.raw/*23.83*/("""">22</a></div>
			</div>                                                            
			<br><br><br><br><br>                                              
			<div class="row">                                                 
			  <div class="span2"><a href=""""),_display_(/*27.35*/controllers/*27.46*/.routes.ImageController.showImage(7)),format.raw/*27.82*/("""">7</a></div>
			  <div class="span2"><a href=""""),_display_(/*28.35*/controllers/*28.46*/.routes.ImageController.showImage(21)),format.raw/*28.83*/("""">21</a></div>
			  <div class="span2"><a href=""""),_display_(/*29.35*/controllers/*29.46*/.routes.ImageController.showImage(17)),format.raw/*29.83*/("""">17</a></div>
			  <div class="span2"><a href=""""),_display_(/*30.35*/controllers/*30.46*/.routes.ImageController.showImage(6)),format.raw/*30.82*/("""">6</a></div>
			  <div class="span2"><a href=""""),_display_(/*31.35*/controllers/*31.46*/.routes.ImageController.showImage(14)),format.raw/*31.83*/("""">14</a></div>
			  <div class="span2"><a href=""""),_display_(/*32.35*/controllers/*32.46*/.routes.ImageController.showImage(1)),format.raw/*32.82*/("""">1</a></div>
			</div>                                                            
			<br><br><br><br><br>                                              
			<div class="row">                                                 
			  <div class="span2"><a href=""""),_display_(/*36.35*/controllers/*36.46*/.routes.ImageController.showImage(4)),format.raw/*36.82*/("""">4</a></div>
			  <div class="span2"><a href=""""),_display_(/*37.35*/controllers/*37.46*/.routes.ImageController.showImage(10)),format.raw/*37.83*/("""">10</a></div>
			  <div class="span2"><a href=""""),_display_(/*38.35*/controllers/*38.46*/.routes.ImageController.showImage(24)),format.raw/*38.83*/("""">24</a></div>
			  <div class="span2"><a href=""""),_display_(/*39.35*/controllers/*39.46*/.routes.ImageController.showImage(13)),format.raw/*39.83*/("""">13</a></div>
			  <div class="span2"><a href=""""),_display_(/*40.35*/controllers/*40.46*/.routes.ImageController.showImage(9)),format.raw/*40.82*/("""">9</a></div>
			  <div class="span2"><a href=""""),_display_(/*41.35*/controllers/*41.46*/.routes.ImageController.showImage(19)),format.raw/*41.83*/("""">19</a></div>
			</div>                                                            
			<br><br><br><br><br>                                              
			<div class="row">                                                 
			  <div class="span2"><a href=""""),_display_(/*45.35*/controllers/*45.46*/.routes.ImageController.showImage(18)),format.raw/*45.83*/("""">18</a></div>
			  <div class="span2"><a href=""""),_display_(/*46.35*/controllers/*46.46*/.routes.ImageController.showImage(12)),format.raw/*46.83*/("""">12</a></div>
			  <div class="span2"><a href=""""),_display_(/*47.35*/controllers/*47.46*/.routes.ImageController.showImage(2)),format.raw/*47.82*/("""">2</a></div>
			  <div class="span2"><a href=""""),_display_(/*48.35*/controllers/*48.46*/.routes.ImageController.showImage(23)),format.raw/*48.83*/("""">23</a></div>
			  <div class="span2"><a href=""""),_display_(/*49.35*/controllers/*49.46*/.routes.ImageController.showImage(16)),format.raw/*49.83*/("""">16</a></div>
			  <div class="span2"><a href=""""),_display_(/*50.35*/controllers/*50.46*/.routes.ImageController.showImage(5)),format.raw/*50.82*/("""">5</a></div>
			</div>
			<br><br><br><br><br>
		</div>
		
    </body>
</html>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 01 00:03:56 CET 2018
                  SOURCE: C:/Users/LucasWeidner/Play/play-adventskalender/app/views/calendar.scala.html
                  HASH: 021421e13537b62f5bf6600bf7cee76d0b2aea24
                  MATRIX: 1033->0|1205->146|1219->152|1271->184|1350->237|1364->243|1425->284|1655->487|1670->493|1730->532|1819->594|1834->600|1893->638|1958->676|1973->682|2034->722|2226->887|2246->898|2304->935|2380->984|2400->995|2457->1031|2532->1079|2552->1090|2610->1127|2686->1176|2706->1187|2763->1223|2838->1271|2858->1282|2916->1319|2992->1368|3012->1379|3070->1416|3356->1675|3376->1686|3433->1722|3508->1770|3528->1781|3586->1818|3662->1867|3682->1878|3740->1915|3816->1964|3836->1975|3893->2011|3968->2059|3988->2070|4046->2107|4122->2156|4142->2167|4199->2203|4484->2461|4504->2472|4561->2508|4636->2556|4656->2567|4714->2604|4790->2653|4810->2664|4868->2701|4944->2750|4964->2761|5022->2798|5098->2847|5118->2858|5175->2894|5250->2942|5270->2953|5328->2990|5614->3249|5634->3260|5692->3297|5768->3346|5788->3357|5846->3394|5922->3443|5942->3454|5999->3490|6074->3538|6094->3549|6152->3586|6228->3635|6248->3646|6306->3683|6382->3732|6402->3743|6459->3779
                  LINES: 33->1|37->5|37->5|37->5|39->7|39->7|39->7|42->10|42->10|42->10|43->11|43->11|43->11|45->13|45->13|45->13|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50
                  -- GENERATED --
              */
          