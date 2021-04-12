package com.tutorial.playground.basics

object Expressions extends App {

  val x = 1 + 2 // expression
  println(x)

  // Instructions vs expression
  val condition = true
  val result = if (condition) 5 else 3 // If is an expression, not an instruction
  println(result)

  // everything in scala is an expression
  // side effects in scala are expressions returning unit

  var variable = 1
  val weirdValue = (variable = 3)

  // code blocks
  val codeBlock = { // it is an expression
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"
  }
}
