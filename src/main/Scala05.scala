package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala05 {

  def reverse[A](list: List[A]) : List[A] = list match {
    case Nil => Nil
    case head :: Nil => list
    case head :: tail => reverse(tail) :+ head
  }
}
