package gbastkowski.kata.karatechop

class BinarySearch(array: Array[Int]) {

  def chop(value: Int): Int = {
    if (array.isEmpty) -1
    else chop(value, 0, array.length)
  }

  private[this] def chop(value: Int, from: Int, to: Int): Int = {
    val splitAt = from + ((to - from) / 2)

    val notFound = to - from <= 1 && value != array(splitAt)
    val inLeftHalf = value < array(splitAt)
    val inRightHalf = value > array(splitAt)

    if      (notFound)    BinarySearch.NOT_FOUND
    else if (inLeftHalf)  chop(value, from, splitAt)
    else if (inRightHalf) chop(value, splitAt, to)
    else /* found :→ */   splitAt
  }

}

object BinarySearch {
  val NOT_FOUND: Int = -1

  def apply(array: Array[Int]): BinarySearch = new BinarySearch(array)

  def apply(ints: Int*): BinarySearch = apply(Array(ints: _*))
}
