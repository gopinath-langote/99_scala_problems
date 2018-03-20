package com.funscala.problems

import org.scalatest.FlatSpec

class ListsUtilsTest extends FlatSpec {

  import ListsUtils._

  "List" should "return last element in list" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }
}
