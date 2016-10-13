package com.ittaiz.javaone.implicits.enhancelibrary

import com.ittaiz.javaone.implicits.enhancelibrary.EnhancedThirdPartyImplicits.AccumulateThirdPartyCode

object ScalaExample extends App {
  val springFWInstance = SpringFWCode(5)
  val otherSpringFWInstance = SpringFWCode(7)

  //println(springFWInstance accumulate otherSpringFWInstance)
  println(springFWInstance + otherSpringFWInstance)
}

