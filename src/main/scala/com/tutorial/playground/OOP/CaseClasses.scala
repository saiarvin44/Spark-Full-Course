package com.tutorial.playground.OOP

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  // 2. Sensible toString
  // 3. equals and hashcode implemented by default

  val jim = new Person("jim", 34)
  println(jim.name + " " + jim.toString + " " + jim)

  val jim2 = new Person("jim", 34)
  println(jim == jim2) // false in case of normal class

  val arvind = jim.copy(name = "Arvind", age = 23) // copy

  // companion objects by default
  val thePerson = Person
  val mary = Person("Mary", 24)

  // case classes are serializable
  // akka

  // case classes have extractor patterns ie can be used in pattern matching

  case object uk {
    def name: String = "United kingdom"
  }
  // same as case class but dont have companion objects

}
