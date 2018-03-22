package com.funscala.problems

object _02_SecondLastElementInList {
  def penultimate(xs: List[Int]): Int = xs match {
    case second :: _ :: Nil => second
    case _ :: rest => penultimate(rest)
    case _ => throw new NoSuchElementException
  }
}
