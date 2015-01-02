package bootstrap.liftweb

import net.liftweb.http.{Html5Properties, LiftRules, Req}
import net.liftweb.sitemap.{Menu, SiteMap}
import reactive.web.lift._

class Boot {

  def boot {

    LiftRules.addToPackages("com.webitoria")

    def sitemap(): SiteMap = SiteMap(
      Menu.i("Home") / "index"
    )

    LiftRules.htmlProperties.default.set( (r: Req) => new Html5Properties(r.userAgent) )

    LiftRules.logServiceRequestTiming = false

    AppendToRender.init()
    LiftCometTransportType.init()
    SimpleAjaxTransportType.init()
    SseTransportType.init()

  }

}


