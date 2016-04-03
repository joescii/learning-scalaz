package com.joescii.scalaz

import org.scalatest.{ShouldMatchers, WordSpec}
import Addable._

class AddableSpec extends WordSpec with ShouldMatchers {
  "Addable.sumGeneric()" should {
    "work for integers" in {
      val a = List(1, 2, 3)
      sumGeneric(a) shouldEqual 6
    }
  }
}
