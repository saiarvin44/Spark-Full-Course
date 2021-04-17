package com.tutorial.playground.functionalProgramming

object AnonymousFunctions extends App {
  // anonymous function or lambda
  val doubler = (x: Int) => x * 2

  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  val incrementer: Int => Int = _ + 1 // x => x+1
  val niceAdder: (Int, Int) => Int = _ + _ // (a,b) => a+b
  println(adder(1, 2))

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(4)(5))
}
