package com.funscala

import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("Main.hello") {
    assert(Main.hello() === "Hello, World")
  }
}
