package com.webitoria.snippet

import org.slf4j.LoggerFactory

trait Loggable {

  val logger = LoggerFactory.getLogger(getClass)

}
