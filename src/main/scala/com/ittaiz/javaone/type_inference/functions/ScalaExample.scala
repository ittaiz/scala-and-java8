package com.ittaiz.javaone.type_inference.functions

object ScalaExample extends App {
  //Similar to Java version but still less verbose
  val addVerbose: Function2[Int, Int, Int] = (a, b) => a + b
  println(addVerbose(5, 7))

  //Scala version #1
  val addCompact: (Int, Int) => Int = (a, b) => a + b
  println(addCompact(5, 7))

  //Scala version #2
  val addInferred = (a: Int, b: Int) => a + b
  println(addInferred(5, 7))

}
