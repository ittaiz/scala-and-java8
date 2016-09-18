package com.ittaiz.javaone.pattern_matching

object ExhaustivenessMatchingExample extends App {

  feedFamily(MarryMother, JoanneMother, JoshEldest)

  //feedFamily(MarryMother, JoanneMother, JoshEldest, JaineYoungest)

  def feedFamily(familyMembers: FamilyMember*): Unit = {
    familyMembers foreach {
      case MarryMother => println(s"feeding $MarryMother")
      case JoanneMother => println(s"feeding $JoanneMother")
      case JoshEldest => println(s"feeding $JoshEldest")
    }
  }


  sealed trait FamilyMember
  case object MarryMother extends FamilyMember
  case object JoanneMother extends FamilyMember
  case object JoshEldest extends FamilyMember
  case object JaineYoungest extends FamilyMember
}

