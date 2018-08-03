package gbastkowski.kata.karatechop

object BinarySearch {

  val NOT_FOUND: Int = -1

  def chop(value: Int, array: Array[Int]): Int = {
    if (array.isEmpty) -1
    else chop(value, array, 0, array.length)
  }

  private[this] def chop(value: Int, array: Array[Int], from: Int, to: Int): Int = {
    val splitAt = from + ((to - from) / 2)

    if (to - from <= 1 && value != array(splitAt)) NOT_FOUND
    else if (value < array(splitAt))  chop(value, array, from, splitAt)
    else if (value > array(splitAt))  chop(value, array, splitAt, to)
    else /* value ==array(splitAt) */ splitAt
  }

}
