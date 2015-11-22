package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala25 {
  def randomPermute[A](list: List[A]) = {
    Scala23.randomSelect(list.length, list)
  }

}
