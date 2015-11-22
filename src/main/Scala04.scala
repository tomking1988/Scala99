package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala04 {

  def length[A](list: List[A]) : Int= {
    list match {
      case Nil => 0
      case head::tail => 1 + length(tail)
    }
  }
}
