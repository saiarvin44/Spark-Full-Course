package com.tutorial.playground.basics

object StringOps extends App {
  val str: String = "Hello, I am Arvind";
  println(str.charAt(2))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))

  val numberString = "45"
  val number = numberString.toInt
  println('a' + numberString)

  val name = "Arvind"
  val age = 23
  val greeting = s"Hello, my name is $name and I am $age years old"

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minutes"
  println(myth)
}
