package com.github.cliveevans


case class Fraction(val numerator: Long, val denominator: Long) extends Number {

  override def longValue(): Long = numerator/denominator

  override def intValue(): Int = (numerator/denominator).toInt

  override def floatValue(): Float = numerator.toFloat / denominator.toFloat

  override def doubleValue(): Double = numerator.toDouble / denominator.toDouble
}

object Fraction {

}

