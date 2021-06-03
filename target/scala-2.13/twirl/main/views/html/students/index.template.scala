
package views.html.students

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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Student],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(students :  List[Student]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<h1>All Students</h1>
"""),_display_(/*4.2*/for(student <- students) yield /*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
    """),format.raw/*5.5*/("""<a href=""""),_display_(/*5.15*/routes/*5.21*/.StudentsController.show(student.id)),format.raw/*5.57*/("""">Name: """),_display_(/*5.66*/student/*5.73*/.name),format.raw/*5.78*/("""</a>
    <p> Age: """),_display_(/*6.15*/student/*6.22*/.age),format.raw/*6.26*/(""" """),format.raw/*6.27*/("""</p>
    <p> Branch: """),_display_(/*7.18*/student/*7.25*/.branch),format.raw/*7.32*/(""" """),format.raw/*7.33*/("""</p>
    <p> Marks: """),_display_(/*8.17*/student/*8.24*/.marks),format.raw/*8.30*/(""" """),format.raw/*8.31*/("""</p>
""")))}),format.raw/*9.2*/("""
"""),format.raw/*10.1*/("""<a href=""""),_display_(/*10.11*/routes/*10.17*/.StudentsController.create()),format.raw/*10.45*/("""">Create</a>

"""))
      }
    }
  }

  def render(students:List[Student]): play.twirl.api.HtmlFormat.Appendable = apply(students)

  def f:((List[Student]) => play.twirl.api.HtmlFormat.Appendable) = (students) => apply(students)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/students/index.scala.html
                  HASH: 26c1d5073a28cde5cca6ab075f1a931216e50a38
                  MATRIX: 923->1|1044->29|1071->30|1119->53|1158->77|1196->78|1227->83|1263->93|1277->99|1333->135|1368->144|1383->151|1408->156|1453->175|1468->182|1492->186|1520->187|1568->209|1583->216|1610->223|1638->224|1685->245|1700->252|1726->258|1754->259|1789->265|1817->266|1854->276|1869->282|1918->310
                  LINES: 27->1|32->2|33->3|34->4|34->4|34->4|35->5|35->5|35->5|35->5|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|37->7|38->8|38->8|38->8|38->8|39->9|40->10|40->10|40->10|40->10
                  -- GENERATED --
              */
          