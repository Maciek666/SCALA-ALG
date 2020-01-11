import org.scalatest._
import org.scalatest.Assertions._

import zeroOrInftTest._

class zeroOrInftTest extends FlatSpec {
  it should "pass basic tests" in {
    testing(5, 1.275)
    testing(6, 1.2125)
    testing(7, 1.173214)

  }
}

object zeroOrInftTest {

  def testing(n: Int, expect: Double): Unit = {
    println("Testing: " + n)
    val actual: Double = zeroOrInft.going(n)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect) {
      actual
    }
  }
}