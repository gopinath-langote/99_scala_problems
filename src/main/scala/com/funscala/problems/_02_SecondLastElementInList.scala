package com.funscala.problems

object _02_SecondLastElementInList {
  def penultimate(xs: List[Int]): Int = xs match {
    case Nil => throw new NoSuchElementException
    case head :: Nil => throw new NoSuchElementException
    case second :: _ :: Nil => second
    case _ :: first :: rest => penultimate(first :: rest)
  }
}
