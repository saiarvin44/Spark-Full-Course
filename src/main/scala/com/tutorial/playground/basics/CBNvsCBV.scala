package com.tutorial.playground.basics

object CBNvsCBV extends App {

  def callByValue(x: Long) = {
    println("By Value : " + x)
    println("By Value : " + x)
  }

  /** in call by name,
   * value is not evaluated before hand,
   * expression is passed to functions
   * and is evaluated inside function
   */

  def callByName(x: => Long) = {
    println("By Name : " + x)
    println("By Name : " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
