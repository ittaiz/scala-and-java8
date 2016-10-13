package com.ittaiz.javaone.implicits.enhancelibrary

object EnhancedThirdPartyImplicits {

  implicit class AccumulateThirdPartyCode(instance: SpringFWCode) {
    def accumulate(other: SpringFWCode): SpringFWCode =
      SpringFWCode(instance.sum + other.sum)

    def +(otherThirdPartyCode: SpringFWCode): SpringFWCode =
      accumulate(otherThirdPartyCode)
  }

}
