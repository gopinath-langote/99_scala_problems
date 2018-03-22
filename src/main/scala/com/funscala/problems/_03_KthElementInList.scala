package com.funscala.problems

object _03_KthElementInList {
  def kTh(k: Int, xs: List[Int]): Int = (k, xs) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => kTh(n - 1, tail)
    case (n, Nil) => throw new NoSuchElementException
  }
}
