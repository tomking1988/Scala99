package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala14 {
  def duplicate[A](list: List[A]) = {
    list flatMap (elem => List(elem, elem))
  }
}
