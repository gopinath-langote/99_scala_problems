package com.funscala.problems

import org.scalatest.FlatSpec

class _04_ListSizeTest extends FlatSpec {

  import _04_ListSize._

  behavior of "List Size"

  it should "return size of list" in {
    assert(size(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  it should "return 0 if list is empty" in {
    assert(size(List()) === 0)
  }

}
