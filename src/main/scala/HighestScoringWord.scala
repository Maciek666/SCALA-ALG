/*
task from codewars.com

Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

  If two words score the same, return the word that appears earliest in the original string.

  All letters will be lowercase and all inputs will be valid.*/


object HighestScoringWord {

  def high(s: String): String = {
    def value(string: String): (Int, String) = {
      (string.toLowerCase().map(_.toInt - 96).sum, string)
    }

    val x = s.split(' ')
      .map(value).maxBy(_._1)
    s"${x._2}"
  }
}
