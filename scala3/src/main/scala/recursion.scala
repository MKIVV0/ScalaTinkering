def factorial(n : Int) : Int =
  if (n == 0) 1
  else factorial(n-1)

// Simulates an iterative version
def factorial_it(product : Int, counter : Int, max_counter : Int) : Int =
  if (counter > max_counter) product
  else factorial_it(product * counter, counter + 1, max_counter)

// Recursive greatest common denominator
def gcd(a : Int, b : Int) : Int =
  if (b == 0) a else gcd(b, a % b)

// Recursive fibonacci
def fib(n : Int) : Int =
  if (n == 0) 0
  else if (n == 1) 1
  else fib(n-1)+fib(n-2)

@main def main(args : String) : Unit =
  var a = factorial_it(1, 1, 3)
  println("Iterative factorial: " + a)
  println("GCD: " + gcd(10, 5))
  println("Fibonacci: " + fib(3))