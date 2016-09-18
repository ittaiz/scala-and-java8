package com.ittaiz.javaone.extras.scoping

class ScopingExample {

  def publicMethod(): Unit = {
    println("I'm public")
  }

  private[scoping] def privateScoping(): Unit = {
    println("I'm private to package scoping")
  }

  private[javaone] def privateJavaOne(): Unit = {
    println("I'm private to package javaone and sub-packages")
  }

  def usesAnotherInstance(s: ScopingExample): Unit = {
    this.privateMethod()
    s.privateMethod()
    //s.mutateInternalState
  }

  private def privateMethod(): Unit = {
    println("I'm private to the class")
    if (someInvariant()) {
      mutateInternalState()
    }
  }

  private[this] def mutateInternalState(): Unit = {
    println(s"I'm private to a specific instance $this")
  }

  private def someInvariant(): Boolean = true
}

object ScopingExampleConsumer extends App {
  val example = new ScopingExample
  val otherExample = new ScopingExample
  example.publicMethod()
  example.privateJavaOne()
  example.privateScoping()
  example.usesAnotherInstance(otherExample)
}