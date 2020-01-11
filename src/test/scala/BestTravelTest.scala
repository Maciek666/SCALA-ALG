import org.scalatest._
import org.scalatest.Assertions._

import BestTravelTest._

class BestTravelTest extends FlatSpec {
  it should "pass basic tests" in {
    var ts = List(50, 55, 56, 57, 58)
    testing(163, 3, ts, 163)
    ts = List(50)
    testing(163, 3, ts, -1)
    testing(163, 1, ts, 50)

  }
}

object BestTravelTest {

  private def testing(t: Int, k: Int, ls: List[Int], expect: Int): Unit = {
    println("Testing:\n" + t + " " + k + "\n" + ls.mkString(", "))
    val actual: Int = BestTravel.chooseBestSum(t, k, ls)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect){actual}
  }
}
