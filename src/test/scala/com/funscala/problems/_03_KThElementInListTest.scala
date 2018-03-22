package com.funscala.problems

import java.util.NoSuchElementException

import org.scalatest.FlatSpec

class _03_KThElementInListTest extends FlatSpec {

  import _03_KthElementInList._

  behavior of "Kth Element In List"

  it should "return 3rd element in list" in {
    assert(kTh(2, List(1, 1, 2, 3, 5, 8)) === 2)
  }

  it should "throw NoSuchElementException if list is empty" in {
    intercept[NoSuchElementException] {
      kTh(1, List())
    }
  }

  it should "throw NoSuchElementException if list size is less than k" in {
    intercept[NoSuchElementException] {
      kTh(10, List(1, 2, 3))
    }
  }

}
