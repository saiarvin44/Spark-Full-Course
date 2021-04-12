package com.tutorial.playground.basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  // parameterless functions can be called with just their name

  def recursiveFunc(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + recursiveFunc(aString, n - 1)
  }

  println(recursiveFunc("hello", 3))

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }


}
