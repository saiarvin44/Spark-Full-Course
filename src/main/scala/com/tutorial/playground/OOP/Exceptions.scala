package com.tutorial.playground.OOP

object Exceptions extends App {

  val x: String = null
  // println(x.length)

  // val weirdValue: String = throw new NullPointerException
  // Exception and Error are major Throwable subtypes

  def getInt(withException: Boolean): Int =
    if (withException) throw new RuntimeException("No Int for you")
    else 42

  val potentialFail = try {
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught a runtime exception")
  }
  finally {
    println("finally")
  }

  println(potentialFail)

  class MyException extends Exception

  val exception = new MyException

  throw exception
}
