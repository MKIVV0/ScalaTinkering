class Empty extends IntSet {
  def contains (x : Int) : Boolean = false
  def add (x : Int) : IntSet = new NonEmpty(x, new Empty(), new Empty())
}
