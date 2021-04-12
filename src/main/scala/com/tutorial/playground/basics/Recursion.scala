package com.tutorial.playground.basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = if (n <= 1) 1 else {
    println("Computing factorial of " + n + ". Need factorial of " + (n - 1))
    var result = n * factorial(n - 1)
    println("Computed factorial of " + n)
    result
  }

  println(factorial(10))

  // when u need loops, use tail recursion
  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // tail recursion = use recursive call as last expression

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumuator: String): String =
    if (n <= 0) accumuator
    else concatenateTailRec(aString, n - 1, aString + accumuator)

  println(concatenateTailRec("hello", 3, ""))
}
