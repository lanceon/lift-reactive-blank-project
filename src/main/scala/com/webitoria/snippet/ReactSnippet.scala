package com.webitoria.snippet

import net.liftweb.util.BindHelpers._
import org.joda.time.DateTime
import reactive.web._
import reactive.web.html.{Button, Span}
import reactive.web.javascript._
import reactive.{Signal, Timer}

import scala.xml.{NodeSeq, Text}


class ReactSnippet extends PageSnippet with Loggable {

  def time = Text(DateTime.now.toString("dd.mm.yyyy hh:mm:ss"))

  val timer: Signal[NodeSeq] = (new Timer(0, 1000)).map(_ => time).hold(time)

  val btn = Button("Button"){ }

  def render =
    "data-bind=box" #> Span(timer)

}
