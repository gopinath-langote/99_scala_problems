package com.funscala.problems

object _01_LastElementInList {
  def last(xs: List[Int]): Int = xs match {
    case Nil => throw new NoSuchElementException
    case head :: Nil => head
    case head :: tail => last(tail)
  }
}