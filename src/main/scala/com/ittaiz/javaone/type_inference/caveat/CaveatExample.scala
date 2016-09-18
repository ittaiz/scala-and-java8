package com.ittaiz.javaone.type_inference.caveat

object CaveatExample extends App {

  def getMeTheProfessional: Profession = Cook
  println(getMeTheProfessional.doYourThing)
  //println(getMeTheProfessional.secretIngredient) // does not compile


  def getMeTheProfessionalDangerous = Cook
  println(getMeTheProfessionalDangerous.secretIngredient)
  println(getMeTheProfessionalDangerous.doYourThing)


}

trait Profession {
  def doYourThing: String
}

case object Cook extends Profession {
  override def doYourThing: String = "Here's your Asparagus"

  def secretIngredient: String = "Whole lot of secret love"
}

case object Policewoman extends Profession {
  override def doYourThing: String = "I am watching you"
}


