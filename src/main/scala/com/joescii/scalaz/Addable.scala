package com.joescii.scalaz

trait Addable[A] {
  def plus(x: A, y: A): A
}

object Addable {
  implicit def numericIsAddable[A](implicit A: Numeric[A]): Addable[A] =
    new Addable[A] {
      def plus(x: A, y: A): A = A.plus(x, y)
    }

  implicit val stringIsAddable: Addable[String] =
    new Addable[String] {
      def plus(x: String, y: String): String = x + y
    }

  def sumGeneric[A](l: List[A])(implicit A: Addable[A]): A =
    l.reduce(A.plus)
}
