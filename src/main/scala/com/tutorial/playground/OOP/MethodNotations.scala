package com.tutorial.playground.OOP

object MethodNotations extends App {

  class Person(val name: String, movie: String) {
    def likes(movie: String): Boolean = movie == this.movie

    def hangout(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the fuck!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, I am ${name}"

  }

  def mary = new Person("Mary", "Inception")

  println(mary.likes("inception"))
  println(mary likes "inception") // infix notation only work with methods with one parameter
  // this is also called syntactic sugar

  val tom = new Person("Tom", "Fight shit")
  println(mary hangout tom)

  println(1.+(2))

  // prefix notations

  val x = -1
  val y = 1.unary_-
  println(!mary)
  // unary_prefix only works with few operators

  // postfix expression
  println(mary.isAlive)
  println(mary isAlive) // postfix notation works only with methods with no parameter

  // apply
  println(mary.apply())
  println(mary())
}
