package com.funscala.problems

import org.scalatest.FlatSpec

class _05_ReverseListTest extends FlatSpec {

  import _05_ReverseList._

  behavior of "Reverse List"

  it should "return reversed list" in {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }

  it should "return empty list for empty list's reverse" in {
    assert(reverse(List()) === List())
  }

  it should "return empty same list is list has only one element" in {
    assert(reverse(List(1)) === List(1))
  }

}
