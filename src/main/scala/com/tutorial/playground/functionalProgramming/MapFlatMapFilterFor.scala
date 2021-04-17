package com.tutorial.playground.functionalProgramming

object MapFlatMapFilterFor extends App {

  val list = List(1, 2, 3)
  println(list.head, list.tail)

  // map
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))

  // flatMap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')

  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations)

  // foreach
  list.foreach(println)

  // syntax overload
  list.map(x =>
    x * 2)


}
