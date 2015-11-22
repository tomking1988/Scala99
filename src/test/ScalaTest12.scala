package test

import main.Scala12

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest12 {
  def main(args: Array[String]) = {
    test
  }

  def test() = {
    val encodedList = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val decodedList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    require(Scala12.decode(encodedList) == decodedList)

    println("Pass test")
  }
}
