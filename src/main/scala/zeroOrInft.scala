object zeroOrInft extends App {
  val factorial: Int => BigDecimal = (n: Int) => if (n == 1) 1l else n * factorial(n - 1)

  def going(n: Int): Double = {
    val x: BigDecimal = factorial(n)
    val y: BigDecimal = (1 until n).map(factorial).sum + x
    val wynik = BigDecimal(1)./(x).*(y)  //.toString.substring(0,8).toDouble
    f"$wynik%1.6f" replaceAll(",", ".") toDouble
  }

  println(going(7))
}
