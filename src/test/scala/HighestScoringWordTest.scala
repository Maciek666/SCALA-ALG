import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec

class SampleTestSpec extends AnyFlatSpec with Matchers {

  """high("man i need a taxi up to ubud")""" should """return "taxi" """ in {
    HighestScoringWord.high("man i need a taxi up to ubud") should be("taxi")
  }
  """high("what time are we climbing up to the volcano")""" should """return "volcano" """ in {
    HighestScoringWord.high("what time are we climbing up to the volcano") should be("volcano")
  }
  """high("take me to semynak")""" should """return "semynak" """ in {
    HighestScoringWord.high("take me to semynak") should be("semynak")
  }
  """high("for equals return earliestg")""" should """return "return" """ in {
    HighestScoringWord.high("for equals return earliestg") should be("return")
  }
  """high("find or finda")""" should """return "finda" """ in {
    HighestScoringWord.high("find or finda") should be("finda")
  }
}

