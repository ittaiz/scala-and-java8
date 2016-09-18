package com.ittaiz.javaone.implicits.classtag

import scala.reflect.ClassTag

object ScalaExample extends App {

  def deserialize[T](t: T)(implicit ct: ClassTag[T]) = s"deserializing ${ct.runtimeClass}"

  val deserialized = deserialize(new SomeDomainObject("foo"))

  println(deserialized)
}



