object MultiplesOf3Or5 {
  def solution(number: Int): Long = {
    val mulitples: (Int) => Boolean = (i: Int) => if (i % 5 == 0 || i % 3 == 0) true else false
    (1 until number).filter(mulitples).map(_.toLong).sum
  }
  solution(10)
}
