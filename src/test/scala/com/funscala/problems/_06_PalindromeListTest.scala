package com.funscala.problems

import org.scalatest.FlatSpec

class _06_PalindromeListTest extends FlatSpec {

  import _06_PalindromeList._

  behavior of "Palindrome List"

  it should "return true for palindrome list" in {
    assert(isPalindrome(List(1, 2, 1)) === true)
  }

  it should "return false for non palindrome list" in {
    assert(isPalindrome(List(1, 2, 3)) === false)
  }
  it should "return true for empty list" in {
    assert(isPalindrome(List()) === true)
  }
  it should "return true for list containing single element" in {
    assert(isPalindrome(List(1)) === true)
  }
}
