package com.ittaiz.javaone.pattern_matching

trait Animal

case class Dog(name: String, canBeTakenForAWalk: Boolean = false) extends Animal
case class Cat(name: String) extends Animal

