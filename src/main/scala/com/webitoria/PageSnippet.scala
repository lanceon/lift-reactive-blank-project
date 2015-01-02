package com.webitoria.snippet

import reactive.Observing
import reactive.web.Page
import reactive.web.lift._

trait PageSnippet extends Observing {

  implicit lazy val page = Page(
    new AppendToRenderTransportType(_),
    //new LiftCometTransportType(_),
    //new SimpleAjaxTransportType(_),
    new SseTransportType(_)
  )

}
