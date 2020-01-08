

object CaesarCipher extends App {
  def transform(shift: Int, letter: Char): Char = {
    def t1(letterMaxLim: Int): Char = {
      var x: Char = (letter + shift).toChar
      while (x > letterMaxLim) x = (x - 26).toChar
      x
    }

    def t2(letterMinLim: Int): Char = {
      var x: Char = (letter + shift).toChar
      while (x < letterMinLim) x = (x + 26).toChar
      x
    }

    if (letter > 90 && shift >= 0) t1(122)
    else if (letter < 90 && shift >= 0) t1(90)
    else if (letter > 90 && shift < 0) t2(97)
    else t2(65)
  }

  def movingShift(s: String, shift: Int): List[String] = {
    var sb: StringBuilder = new StringBuilder
    for (i <- 0 until s.length) {
      if (s(i).isLetter)
        sb.append(transform(shift + i, s(i)))
      else sb.append(s(i))
    }
    var x = scala.collection.mutable.MutableList[String]()
    val len: Int = math.ceil(s.length.toDouble / 5.0).toInt

    for (i <- len until s.length by len) {
      x.+=(sb.toString().splitAt(len)._1)
      sb = new StringBuilder(sb.toString().splitAt(len)._2)

    }
    x += sb.toString()
    if(x.length==4)x+=""
    x.map(identity)(collection.breakOut)
  }

  // your code

  def demovingShift(s: List[String], shift: Int): String = {
    val sb: StringBuilder = new StringBuilder
    s.foreach(sb.append)
    val sbtmp: StringBuilder = new StringBuilder

    for (i <- sb.indices) {
      if (sb(i).isLetter)
        sbtmp.append(transform(-shift - i, sb(i)))
      else sbtmp.append(sb(i))
    }
    sbtmp.toString()
  }

  val x = movingShift("... -O2 -std=c++0x  -c [C]:",3)
  x.foreach(print)
  println()
  print(demovingShift(x,3))

}
