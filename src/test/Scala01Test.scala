package test

import main.Scala01

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala01Test {

  def main(args: Array[String]) = {
    test1()
  }

  def test1() = {
    val testList = List(1, 1, 2, 3, 5, 8)
    require(Scala01.last(testList) == 8)
    println("Pass test 1");
  }
}
