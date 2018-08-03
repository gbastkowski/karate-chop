package gbastkowski.kata.karatechop

import org.scalatest._
import Matchers._


class BinarySearchSpec extends FreeSpec with Matchers {

  import BinarySearch.chop

  "BinarySearch.chop()" - {
    "on an empty array" - {
      val array = Array[Int]()

      "should answer -1" in {
        chop(3, array) shouldBe -1
      }
    }

    "with an array of three elements" - {
      val array = Array(1, 3, 5)

      "should answer 0 if value is the first element" in {
        chop(1, array) shouldBe 0
      }

      "should answer 1 if value is the second element" in {
        chop(3, array) shouldBe 1
      }

      "should answer -1 if value is not in the array" in {
        chop(0, array) shouldBe -1
      }
    }
  }

}

// assert_equal(-1, chop(0, [1, 3, 5]))
// assert_equal(-1, chop(2, [1, 3, 5]))
// assert_equal(-1, chop(4, [1, 3, 5]))
// assert_equal(-1, chop(6, [1, 3, 5]))
//   #
//   assert_equal(0,  chop(1, [1, 3, 5, 7]))
// assert_equal(1,  chop(3, [1, 3, 5, 7]))
// assert_equal(2,  chop(5, [1, 3, 5, 7]))
// assert_equal(3,  chop(7, [1, 3, 5, 7]))
// assert_equal(-1, chop(0, [1, 3, 5, 7]))
// assert_equal(-1, chop(2, [1, 3, 5, 7]))
// assert_equal(-1, chop(4, [1, 3, 5, 7]))
// assert_equal(-1, chop(6, [1, 3, 5, 7]))
// assert_equal(-1, chop(8, [1, 3, 5, 7]))
