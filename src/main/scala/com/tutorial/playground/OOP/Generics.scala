package com.tutorial.playground.OOP

object Generics extends App {

  class MyList[+A] { // generic class (and covariant)
    // def add(element: A): MyList[A] = ???   : not possible
    def add[B >: A](element: B): MyList[B] = ???

    /**
     * A = Cat
     * B = Animal
     */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyList = MyList.empty[Int]

  // vairance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  // 1. List[Cat] extends List[Animal] : covariance
  class CovariatList[+A]

  val animal: Animal = new Cat
  val animalList: CovariatList[Animal] = new CovariatList[Cat]

  // animalList.add(new Dog) => we return a list of Animals
  // 2. this is possible because CovariatList is a covariant List

  class InVariant[A]

  // 3. val inVariantAnimalList: InVariant[Animal] = new InVariant[Cat]: not possible as it is invariant

  // contravariant list
  class ContravariantList[-A]

  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  // 4. possible and it is called contrvariance


  // bounded types
  class Cage[A <: Animal](animal: A) // A accepts type which are only subclasses of Animal
  val cage = new Cage[Dog](new Dog)

  class CageUpper[A >: Animal] // accepts only super class of Animal


}
