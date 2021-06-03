// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:11
  StudentsController_1: controllers.StudentsController,
  // @LINE:20
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:11
    StudentsController_1: controllers.StudentsController,
    // @LINE:20
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_2, StudentsController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, StudentsController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/details""", """controllers.StudentsController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/details/""" + "$" + """id<[^/]+>""", """controllers.StudentsController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/edit/""" + "$" + """id<[^/]+>""", """controllers.StudentsController.edit(id:Integer, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/edit/""" + "$" + """id<[^/]+>""", """controllers.StudentsController.update(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/add""", """controllers.StudentsController.create(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/add""", """controllers.StudentsController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/delete/""" + "$" + """id<[^/]+>""", """controllers.StudentsController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_StudentsController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/details")))
  )
  private[this] lazy val controllers_StudentsController_index3_invoker = createInvoker(
    StudentsController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "index",
      Nil,
      "GET",
      this.prefix + """student/details""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_StudentsController_show4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/details/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentsController_show4_invoker = createInvoker(
    StudentsController_1.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """student/details/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_StudentsController_edit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentsController_edit5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentsController_1.edit(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "edit",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """student/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_StudentsController_update6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentsController_update6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentsController_1.update(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "update",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """student/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_StudentsController_create7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/add")))
  )
  private[this] lazy val controllers_StudentsController_create7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentsController_1.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """student/add""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_StudentsController_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/add")))
  )
  private[this] lazy val controllers_StudentsController_save8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentsController_1.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """student/add""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_StudentsController_destroy9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentsController_destroy9_invoker = createInvoker(
    StudentsController_1.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentsController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """student/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_2.explore)
      }
  
    // @LINE:8
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_2.tutorial)
      }
  
    // @LINE:11
    case controllers_StudentsController_index3_route(params@_) =>
      call { 
        controllers_StudentsController_index3_invoker.call(StudentsController_1.index())
      }
  
    // @LINE:12
    case controllers_StudentsController_show4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_StudentsController_show4_invoker.call(StudentsController_1.show(id))
      }
  
    // @LINE:13
    case controllers_StudentsController_edit5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_StudentsController_edit5_invoker.call(
          req => StudentsController_1.edit(id, req))
      }
  
    // @LINE:14
    case controllers_StudentsController_update6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_StudentsController_update6_invoker.call(
          req => StudentsController_1.update(id, req))
      }
  
    // @LINE:15
    case controllers_StudentsController_create7_route(params@_) =>
      call { 
        controllers_StudentsController_create7_invoker.call(
          req => StudentsController_1.create(req))
      }
  
    // @LINE:16
    case controllers_StudentsController_save8_route(params@_) =>
      call { 
        controllers_StudentsController_save8_invoker.call(
          req => StudentsController_1.save(req))
      }
  
    // @LINE:17
    case controllers_StudentsController_destroy9_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_StudentsController_destroy9_invoker.call(StudentsController_1.destroy(id))
      }
  
    // @LINE:20
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
