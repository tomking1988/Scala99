package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 9:30 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala21 {
  def insertAt[A](elem: A, pos: Int, list: List[A]) = list.splitAt(pos) match {
    case (pre, post) => pre ::: (elem :: post)
  }
}
