
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
/*1.2*/import java.util

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Student],Student,Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(studentForm : Form[Student],student: Student)(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import scala._
/*4.2*/import helper._


Seq[Any](format.raw/*5.1*/("""

"""),format.raw/*7.1*/("""<html>
<head>
    <title>Edit Student</title>
</head>

<body>
<h1>Edit Student</h1>

"""),_display_(/*15.2*/helper/*15.8*/.form(action = helper.CSRF(routes.StudentsController.update(student.id)))/*15.81*/{_display_(Seq[Any](format.raw/*15.82*/("""

"""),format.raw/*17.1*/("""<p> id: """),_display_(/*17.10*/student/*17.17*/.id),format.raw/*17.20*/(""" """),format.raw/*17.21*/("""</p>
"""),_display_(/*18.2*/helper/*18.8*/.inputText(studentForm("name"))),format.raw/*18.39*/("""
"""),_display_(/*19.2*/helper/*19.8*/.inputText(studentForm("age"))),format.raw/*19.38*/("""
"""),_display_(/*20.2*/helper/*20.8*/.inputText(studentForm("marks"))),format.raw/*20.40*/("""
"""),_display_(/*21.2*/helper/*21.8*/.inputText(studentForm("branch"))),format.raw/*21.41*/("""

"""),format.raw/*23.1*/("""<button class="btn btn-success" type="submit"> Add Student</button>
""")))}),format.raw/*24.2*/("""
"""),format.raw/*25.1*/("""</body>
</html>




"""))
      }
    }
  }

  def render(studentForm:Form[Student],student:Student,request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(studentForm,student)(request,messages)

  def f:((Form[Student],Student) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (studentForm,student) => (request,messages) => apply(studentForm,student)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/students/edit.scala.html
                  HASH: 8ae80a689e077278f1a5ea83f6a6546c369367a4
                  MATRIX: 619->1|986->19|1167->129|1189->145|1233->161|1261->163|1373->249|1387->255|1469->328|1508->329|1537->331|1573->340|1589->347|1613->350|1642->351|1674->357|1688->363|1740->394|1768->396|1782->402|1833->432|1861->434|1875->440|1928->472|1956->474|1970->480|2024->513|2053->515|2152->584|2180->585
                  LINES: 23->1|28->2|31->3|32->4|35->5|37->7|45->15|45->15|45->15|45->15|47->17|47->17|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|53->23|54->24|55->25
                  -- GENERATED --
              */
          