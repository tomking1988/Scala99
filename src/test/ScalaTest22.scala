package test

import main.Scala22

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest22 {
  def main(args: Array[String]) = {
     test
  }

  def test = {
    val list = List(4, 5, 6, 7, 8, 9)

    require(list == Scala22.range(4, 9))
    println("Pass test")
  }

}
