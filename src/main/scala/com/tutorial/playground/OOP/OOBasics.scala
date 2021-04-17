package com.tutorial.playground.OOP

object OOBasics extends App {
  val person = new Person("Arvind", 23)
  println(person.age)
  person.greet("Daniel")

  val author = new Writer("Arvind", "B", 2019)
  val imposter = new Writer("Sai", "B", 2019)
  val novel = new Novel("Some shit", 2020, author)
}

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2 // field

  def greet(name: String): Unit = println(s"${this.name} says : Hi, $name")

  def this(name: String) = this(name, 0) // constructor overloading
}

// class parameters are not fields, to make it field, add val or var

/**
 * Novel and a writer
 * Writer : first name, surname, year
 * - method : fullName
 *
 * Novel : name, year of release, author
 * - method : authorAge
 * - method : isWrittenBy(author)
 * - method : copy(new year of release) = new instance of novel
 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}
