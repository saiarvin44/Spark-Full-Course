package com.tutorial.playground.OOP

object Objects extends App {

  // Scala does not have class level functionality ("static")

  object Person {
    // "static"/"class" level fucntionality
    val N_EYES = 2

    def canFly: Boolean = false
  }

  class Person {

    //instance level functionality

  } // Companions : class and object with same name

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = Singleton instance

  val mary = Person
  val john = Person
  println(mary == john)

  val person1 = new Person
  val person2 = new Person
  println(person1 == person2)

}
