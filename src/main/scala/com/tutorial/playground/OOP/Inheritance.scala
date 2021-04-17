package com.tutorial.playground.OOP

object Inheritance extends App {

  sealed class Animal {
    def eat = println("nomnom")

    val animalType = "stray"
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat

  class Person(name: String, age: Int)

  // constructors
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding

  class Dog(override val animalType: String) extends Animal {
    // fields can also be overridden
    override def eat: Unit = println("crunch, crunch")
  }

  val dog = new Dog("Pet")
  dog.eat
  println(dog.animalType)

  // type substitution
  val unknownAnimal: Animal = new Cat
  unknownAnimal.eat

  // preventing override :
  // 1. use final
  // 2. class can be made final
  // 3. sealed allows you to subclass in this file, but not any other file


}
