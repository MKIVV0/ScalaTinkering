/*
* Write the following functions without using operators !, && or ||:
* - not
* - and
* - or
* - xor
* */

def not(x : Boolean) : Boolean =
  if (x) false else true

def and(x : Boolean, y : Boolean) : Boolean =
  if (x) y else x

def or(x : Boolean, y : Boolean) : Boolean =
  if (x) true else y

// (A AND !B) OR (!A AND B)
def xor(x : Boolean, y : Boolean) : Boolean =
  if (x)
    if (y) false
    else true
  else y

/*@main def main(args : String) : Unit =
  println("Not: " + not(false) + "; " + not(true))
  println("And: " + and(true, true) + "; " + and(true, false) + "; " + and(false, true) + "; " + and(false, false))
  println("Or: " + or(true, true) + "; " + or(true, false) + "; " + or(false, true) + "; " + or(false, false))
  println("Xor: " + xor(true, true) + "; " + xor(true, false) + "; " + xor(false, true) + "; " + xor(false, false))

  val x = 1
  def f(y : Int) = y + 1
  val result = {
    val x = f(3)
    x*x
  } + x
  println(result)
*/