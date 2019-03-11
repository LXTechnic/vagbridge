package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import toml.Toml

@Singleton
class PushController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    val tomldata = """
    [abc]
    def=100
    """
    val parsed = Toml.parse(tomldata)
    // println(parsed)
    Ok(views.html.index())
    // Ok(views.html.index())
  }
}
