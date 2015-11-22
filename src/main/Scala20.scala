package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala20 {
  def removeAt[A](n: Int, list: List[A]) = list.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }

}
