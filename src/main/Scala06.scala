package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala06 {

  def isPalindrome[A](list: List[A]): Boolean = list match {
    case Nil => true
    case head :: Nil => true
    case List(a,b) => a == b
    case head :: tail => ((head == tail.last) && isPalindrome(tail.take(tail.length - 1)))
  }
}
