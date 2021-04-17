package com.tutorial.playground.functionalProgramming

object FunctionBasic extends App {


  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // Function type = Function1[A,B]

  val stringToInt = new Function[String, Int] {
    override def apply(str: String): Int = str.toInt
  }
  println(stringToInt("123"))

  val adder = new ((Int, Int) => Int) {
    override def apply(a: Int, b: Int): Int = a + b
  }

  // all scala functions are objects
}

trait MyFunction[A, B] {
  def apply(element: A): B
}
