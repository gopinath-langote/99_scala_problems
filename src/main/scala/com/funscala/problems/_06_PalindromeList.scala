package com.funscala.problems

object _06_PalindromeList {
  def isPalindrome(xs: List[Int]): Boolean = xs match {
    case Nil => true
    case head :: Nil => true
    case head :: tail if head != tail.last => false
    case _ :: tail => isPalindrome(tail.init)
  }
}
