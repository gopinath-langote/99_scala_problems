package com.funscala.problems

object _04_ListSize {
  def size(xs: List[Int]): Int = xs match {
    case Nil => 0
    case _ :: tail => 1 + size(tail)
  }
}
