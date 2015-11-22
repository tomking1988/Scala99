package test

import main.Scala07

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest07 {

  def main(args: Array[String]) = {

    test()
  }

  def test() = {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))
    val flattenedList = List(1, 1, 2, 3, 5, 8)
    require(Scala07.flatten(list) == flattenedList)
    println("Pass test 1")

  }
}
