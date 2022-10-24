
@main def main(args : String) : Unit =
  def bst = new Empty
  bst.add(7)
  bst.add(5)
  bst.add(11)
  bst.add(9)
  bst.add(13)
  bst.add(3)

  println(bst.contains(100))
  println(bst.contains(7))