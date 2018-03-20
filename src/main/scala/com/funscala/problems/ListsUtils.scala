package com.funscala.problems

object ListsUtils {
  def last(xs: List[Int]): Int = xs match {
    case Nil => throw new NoSuchElementException
    case head :: Nil => head
    case head :: tail => last(tail)
  }
}