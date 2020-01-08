import CaesarCipherTest._
import org.scalatest.Assertions._
import org.scalatest._

class CaesarCipherTest extends FlatSpec {
  it should "pass basic tests" in {
    val u1 = "I should have known that you would have a perfect answer for me!!!";
    val v1 = List("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
    dotest1(u1, 1, v1)
    dotest2(v1, 1, u1)

    val u2 = "O CAPTAIN! my Captain! our fearful trip is done;";
    val v2 = List("T JIYDLUA!", " cp Vukpxg", "m! qxv lli", "apfx hgyg ","bm zlld;");
    dotest1(u2, 5, v2)
    dotest2(v2, 5, u2)
  }
}

object CaesarCipherTest {

  def dotest1(s: String, n: Int, exp: List[String]): Unit = {
    val actual: List[String] = CaesarCipher.movingShift(s, n)
    assertResult(exp){actual}
  }
  def dotest2(v: List[String], n: Int, s: String): Unit = {
    val actual: String = CaesarCipher.demovingShift(v, n)
    assertResult(s){actual}
  }
}