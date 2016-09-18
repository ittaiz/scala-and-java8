package com.ittaiz.javaone.implicits.enhancelibrary

object EnhancedThirdPartyImplicits {

  implicit class AccumulateThirdPartyCode(instance: SomeThirdPartyCode) {
    def accumulate(other: SomeThirdPartyCode): SomeThirdPartyCode =
      SomeThirdPartyCode(instance.sum + other.sum)

    def +(otherThirdPartyCode: SomeThirdPartyCode): SomeThirdPartyCode =
      accumulate(otherThirdPartyCode)
  }

}
