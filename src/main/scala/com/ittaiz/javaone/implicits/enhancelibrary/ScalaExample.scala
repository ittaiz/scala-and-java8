package com.ittaiz.javaone.implicits.enhancelibrary

import com.ittaiz.javaone.implicits.enhancelibrary.EnhancedThirdPartyImplicits.AccumulateThirdPartyCode

object ScalaExample extends App {
  val thirdPartyCode = SomeThirdPartyCode(5)
  val otherThirdPartyCode = SomeThirdPartyCode(7)

  //println(thirdPartyCode.accumulate(otherThirdPartyCode))
  println(thirdPartyCode + otherThirdPartyCode)
}

