package gbastkowski.kata.karatechop

import org.scalatest._
import Matchers._


class BinarySearchSpec extends FreeSpec with Matchers {

  "BinarySearch.chop()" - {
    "on an empty array" - {
      val array = BinarySearch()

      "should answer -1" in {
        array.chop(3) shouldBe -1
      }
    }

    "with an array of three elements" - {
      val array = BinarySearch(1, 3, 5)

      "should answer 0 if value is the first element" in {
        array.chop(1) shouldBe 0
      }

      "should answer 1 if value is the second element" in {
        array.chop(3) shouldBe 1
      }

      "should answer 2 if value is the third element" in {
        array.chop(5) shouldBe 2
      }

      "should answer -1 if value is not in the array" in {
        array.chop(0) shouldBe -1
      }
    }

    "with an Array(1, 3, 5, 7)" - {
      val array = BinarySearch(1, 3, 5, 7)

      "should answer 1 if value is 3" in {
        array.chop(3) shouldBe 1
      }

      "should answer 2 if value is 5" in {
        array.chop(5) shouldBe 2
      }

      "should answer -1 if value is 2" in {
        array.chop(2) shouldBe -1
      }

      "should answer -1 if value is 4" in {
        array.chop(4) shouldBe -1
      }

      "should answer -1 if value is 6" in {
        array.chop(6) shouldBe -1
      }
    }
  }

}
