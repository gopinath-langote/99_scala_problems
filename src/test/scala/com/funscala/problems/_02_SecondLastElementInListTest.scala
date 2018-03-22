package com.funscala.problems

import java.util.NoSuchElementException

import org.scalatest.FlatSpec

class _02_SecondLastElementInListTest extends FlatSpec {

  import _02_SecondLastElementInList._

  behavior of "Second Last Element In List"

  it should "return second last element in list" in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  it should "throw NoSuchElementException if list is empty" in {
    intercept[NoSuchElementException] {
      penultimate(List())
    }
  }

  it should "throw NoSuchElementException if list has only one element" in {
    intercept[NoSuchElementException] {
      penultimate(List(1))
    }
  }

}
