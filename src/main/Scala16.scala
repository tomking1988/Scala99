package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala16 {
  def drop[A](num: Int, list: List[A]) = {
    list.zipWithIndex.filter {case (elem, index) => (index + 1) % num != 0} map {elem => elem._1}
  }

}
