package com.tutorial.playground.OOP

object AnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal { // anonymous class (instantiates a class and assigns it to funnyAnimal)
    override def eat: Unit = println("implemented abstract class")
  }

  println(funnyAnimal.getClass)
}
