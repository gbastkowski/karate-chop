package gbastkowski.kata.karatechop

object BinarySearch {

  def chop(value: Int, array: Array[Int]): Int = {
    if (array.isEmpty) -1
    else chop(value, array, 0, array.length - 1)
  }

  private[this] def chop(value: Int, array: Array[Int], from: Int, to: Int): Int = {
    val idx = from + ((to - from) / 2)

    if (array(idx) == value) idx
    else if (from >= to) -1
    else if (value < array(idx)) chop(value, array, from, idx)
    else chop(value, array, idx, to)
  }

}
