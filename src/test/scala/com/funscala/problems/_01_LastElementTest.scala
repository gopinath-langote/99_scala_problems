package com.funscala.problems

import java.util.NoSuchElementException

import org.scalatest.FlatSpec

class _01_LastElementTest extends FlatSpec {

  import _01_LastElement._

  behavior of "Last Element In List"

  it should "return last element in list" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  it should "throw NoSuchElementException if list is empty" in {
    intercept[NoSuchElementException] {
      last(List())
    }
  }
  
}
