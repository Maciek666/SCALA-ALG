import scala.collection.mutable.ListBuffer

object RemovedNumbers {
  def removNb(n: Long): List[(Long, Long)] = {
    val r = 1L to n
    val sum = (1L + n) * n / 2
    var lb: ListBuffer[(Long, Long)] = ListBuffer()
    for (i <- r; j <- i to n) {
      if (sum - i - j == i * j) {
        lb += ((i, j))
        lb += ((j, i))
      }
    }
    lb.toList
  }
}
