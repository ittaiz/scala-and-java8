package com.ittaiz.javaone.pattern_matching

object MatchTypesAndGuardExample extends App {

  val lucky = Dog(name = "Lucky")
  val bonny = Dog(name = "Bonny", canBeTakenForAWalk = true)
  val philip = Cat(name = "Philip")

  takeCareOfPets(lucky, bonny, philip)

  def takeCareOfPets(pets: Animal*): Unit = {
    pets foreach takeCareOfPet
  }

  def takeCareOfPet(animal: Animal): Unit = {
    animal match {
      case cat: Cat => println(s"I hope you appreciate I let you pet me")
      case dog: Dog if dog.canBeTakenForAWalk => println(s"Going out for a walk")
      case dog: Dog => println(s"Thanks for petting me")
    }
  }

}




