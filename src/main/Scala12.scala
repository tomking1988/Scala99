package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala12 {
  def decode[A](encoded: List[(Int, A)]) = {
    encoded flatMap {
      case (length, elem) => List.fill(length)(elem)
    }
  }

}
