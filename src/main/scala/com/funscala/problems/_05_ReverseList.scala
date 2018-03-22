package com.funscala.problems

object _05_ReverseList {
  def reverse(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case head :: tail => reverse(tail) :+ head
  }
}
