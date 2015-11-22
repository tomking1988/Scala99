package test

import main.Scala02

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest02 {

  def main(args: Array[String]) = {

    test()
  }

  def test() = {
    val list = List(1, 1, 2, 3, 5, 8)
    require(Scala02.penultimate(list) == 5)
    println("Pass test 1");
  }
}
