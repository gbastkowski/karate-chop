package gbastkowski.kata.karatechop

class BinarySearch(array: Array[Int]) {

  def chop(value: Int): Int = {
    if (array.isEmpty) -1
    else chop(value, 0, array.length)
  }

  private[this] def chop(value: Int, from: Int, to: Int): Int = {
    val splitAt = from + ((to - from) / 2)

    if (to - from <= 1 && value != array(splitAt)) BinarySearch.NOT_FOUND
    else if (value < array(splitAt))  chop(value, from, splitAt)
    else if (value > array(splitAt))  chop(value, splitAt, to)
    else /* value ==array(splitAt) */ splitAt
  }

}

object BinarySearch {
  val NOT_FOUND: Int = -1

  def apply(array: Array[Int]): BinarySearch = new BinarySearch(array)

  def apply(ints: Int*): BinarySearch = apply(Array(ints: _*))
}
