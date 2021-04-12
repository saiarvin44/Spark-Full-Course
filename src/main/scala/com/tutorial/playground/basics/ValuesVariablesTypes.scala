package com.tutorial.playground.basics

object ValuesVariablesTypes extends App {
  val x: Int = 42 // vals are immutable, like const
  println(42)

  val aLong: Long = 1234567890123L
  var aFloat: Float = 1.2345f
  var aDouble: Double = 1.234

  var y: Int = 23 // var is mutable
  y += 3
}
