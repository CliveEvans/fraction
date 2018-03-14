package com.github.cliveevans

import org.scalacheck.Prop
import org.scalacheck.Prop.forAll
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class FractionSpec extends Specification with ScalaCheck {

  "A Fraction" >> {
    "with 1 as the denominator" should {
      "be equivalent to the numerator" in {
        forAll { (numerator: Long) =>
          Fraction(numerator, 1).longValue() must be_==(numerator)
          Fraction(numerator, 1).shortValue() must be_==(numerator.toShort)
          Fraction(numerator, 1).intValue() must be_==(numerator.toInt)
          Fraction(numerator, 1).doubleValue() must be_==(numerator.toDouble)
          Fraction(numerator, 1).floatValue() must be_==(numerator.toFloat)
        }
      }
    }

    "with 2 as the denominator" should {
      "be half the numerator" in {
        forAll{ (numerator: Long) =>
          Fraction(numerator, 2).longValue() must be_==(numerator/2)
          Fraction(numerator, 2).shortValue() must be_==((numerator/2).toShort)
          Fraction(numerator, 2).intValue() must be_==((numerator/2).toInt)
          Fraction(numerator, 2).doubleValue() must be_==((numerator/2.0D).toDouble)
          Fraction(numerator, 2).floatValue() must be_==((numerator/2.0F).toFloat)
        }
      }
    }
  }
}
