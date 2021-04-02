// VALUES are immutable constants
val hello: String = "Hola!"

// VARIABLES are mutable
var helloAgain: String = hello
helloAgain = hello + " There"
println(helloAgain)

// Data types
val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14153788
val bigNumber: Long = 12345678
val smallNumber: Byte = 126
val floatNumber: Float = 1.345f

println("Some shit here : " + numberOne + truth + letterA + pi + bigNumber)
println(f"Pi is about $pi%.3f") // f to say that it's printf and can insert variable beautification
println(f"Zero padding on left : $numberOne%05d")
println(s"I can use variable like $numberOne $truth")
println(s"I can include any expression like ${1 + 2}")

val theUltimateAnswer: String = "To life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

// Boolean
val isGrater = 1 > 2
val isLesser = 1 < 2
val impossible = isGrater & isLesser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isSame: Boolean = picard == bestCaptain

// ---------------------------------------------------------------------------------

if (1 > 3) println("impossible") else println("possible")

// Matching (Switch)
val number = 3
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Default")
}

for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

x = 0
do {
  println(x);
  x += 1
} while (x <= 10)

// Expressions
// Having the expression itself prints it
{
  val x = 10;
  x + 20
}

println({
  val x = 10;
  x + 20
})

var a = 0
var b = 1
var c = 1

for (x <- 3 to 10) {
  println(c)
  c = a + b
  a = b
  b = c
}


// -----------------------------------------------------------------------------------

// Functions
// def <function name> (parameter name: type ...) : return type = {}

def squareIt(x: Int): Int = {
  x * x
}

def fibonacci(x: Int): Unit = {
  var a = 0
  var b = 1
  var c = 1
  print(s"$a $b $c")
  for (x <- 3 to x) {
    c = a + b
    print(s" $c ")
    a = b
    b = c
  }
}
println(fibonacci(6))

def transformInt(x: Int, f: Int => Int): Int = {
  f(x)
}
val result = transformInt(2, squareIt)

// Lambda function
val resultCube = transformInt(3, x => x * x * x)

def transformString(x: String, f: String => String): String = {
  f(x)
}

val resultString = transformString("some string", x => x.toUpperCase())

// ---------------------------------------------------------------------------------

// Data structures

// Tuples
// Immutable lists
// 1 based index
val captainStuff = ("String1", "String2", "String3")
println(captainStuff)
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val keyValuePair = "String-1" -> "String-2"
println(keyValuePair._1)
println(keyValuePair._2)

val tupleMixed = ("String", 123, true)

// List
// Like a tuple, but many types
// Must be of same type
// 0 based

val list = List("String", "String2", "String3")
println(list(0))
println(list(1))
println(list.tail)
println(list.head)

for (ship <- list) {
  println(ship)
}

// Map
val mapList = list.map((ship: String) => {
  ship.reverse
})
for (item <- mapList) {
  println(item)
}

// Reduce
val reduceList = List(1, 2, 3, 4, 5)
val sum = reduceList.reduce((x: Int, y: Int) => x + y)

// Filter
val filterList = reduceList.filter((x: Int) => x != 5)

// concatenate
val anotherList = List(6, 7, 8, 9, 10)
val finalList = reduceList ++ anotherList

val reversed = finalList.reverse
val again = reversed.sorted
val distinctValues = again.distinct
val max = distinctValues.max
val total = distinctValues.sum
val hasThree = reversed.contains(3)

// Map
val map = Map("String" -> "another String", "another String" -> "String")
val tryGettingUnknown = util.Try(map("dummy")) getOrElse ("Unknown")