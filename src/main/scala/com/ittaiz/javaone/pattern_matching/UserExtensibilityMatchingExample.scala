package com.ittaiz.javaone.pattern_matching

object UserExtensibilityMatchingExample extends App {

  val danny = new User("Danny", 5, "danny@gmail.com")
  val joe = new User("Joe", 32, "joe@gmail.com")
  val fabio = new User("Fabio", 13, "fabio@hotmail.com.br")

  Seq(danny, joe, fabio) foreach greetUser

  def greetUser(user: User): Unit = {
    user match {
      case User("Joe", _, _) => println("Hi Joe")
      case User(name, 13, _) => println(s"Congrats $name for your Bar-Mitzva")
      case User(_, age, _) if underage(age) => println(s"Sorry, no entrance- you're underage")
    }
  }

  private def underage(age: Int): Boolean = age < 13

  class User(val name: String,
             val age: Int,
             val email: String)
  object User {
    def unapply(maybeNullUser: User): Option[(String, Int, String)] =
      Option(maybeNullUser).map { user =>
        (user.name, user.age, user.email)
      }
  }

}
