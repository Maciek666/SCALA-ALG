/*
from codewars 5kyu

he Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such as

F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying

F(n) * F(n+1) = prod.

Your function productFib takes an integer (prod) and returns an array:

[F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
depending on the language if F(n) * F(n+1) = prod.

If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prodyou will return

[F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
F(m) being the smallest one such as F(m) * F(m+1) > prod.
 */

object ProdFib {
  def productFib(prod: Long): Array[Long] = {
    var n_2 = 1l
    var n_1 = 1l
    while (n_2 * n_1 < prod) {
      n_1 += n_2
      n_2 = n_1 - n_2
    }
    if (n_1 * n_2 == prod) Array(n_2, n_1, 1l) else Array(n_2, n_1, 0)
  }
}
