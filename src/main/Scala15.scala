package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala15 {
  def duplicateN[A](num: Int, list: List[A]) = {
    list flatMap {elem => List.fill(num)(elem)}
  }

}
