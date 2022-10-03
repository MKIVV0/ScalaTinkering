def factorial(n : Int) : Int =
  if (n == 0) 1
  else factorial(n-1)

// Simulates an iterative version
def factorial_it(product : Int, counter : Int, max_counter : Int) : Int =
  if (counter > max_counter) product
  else factorial_it(product * counter, counter + 1, max_counter)

@main def main(args : String) : Unit =
  var a = factorial_it(1, 1, 3)
  println("Iterative factorial: " + a)