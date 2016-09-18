package com.ittaiz.javaone.extras.otherPackageForScoping

import com.ittaiz.javaone.extras.scoping.ScopingExample

object OtherScopingExampleConsumerFromDifferentPackage extends App {
  val example = new ScopingExample
  example.privateJavaOne()
  example.publicMethod()
  //example.privateScoping() //doesn't compile
}
