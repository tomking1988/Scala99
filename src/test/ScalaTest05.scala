package test

import main.Scala05

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest05 {

  def main(args: Array[String]) = {

    test()
  }

  def test() = {
    val list = List(1, 1, 2, 3, 5, 8)
    val reversedList = List(8, 5, 3, 2, 1, 1)
    require(Scala05.reverse(list) == reversedList)
    println("Pass test")
  }
}
