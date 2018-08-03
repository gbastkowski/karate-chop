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

      "should answer 2 if value is the third element" in {
        chop(5, array) shouldBe 2
      }

      "should answer -1 if value is not in the array" in {
        chop(0, array) shouldBe -1
      }
    }

    "with an Array(1, 3, 5, 7)" - {
      val array = Array(1, 3, 5, 7)

      "should answer 1 if value is 3" in {
        chop(3, array) shouldBe 1
      }

      "should answer 2 if value is 5" in {
        chop(5, array) shouldBe 2
      }

      "should answer -1 if value is 2" in {
        chop(2, array) shouldBe -1
      }

      "should answer -1 if value is 4" in {
        chop(4, array) shouldBe -1
      }

      "should answer -1 if value is 6" in {
        chop(6, array) shouldBe -1
      }
    }
  }

}
