package test

import main.Scala13

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest13 {
  def main(args: Array[String]) = {
    test
  }

  def test() = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    require(Scala13.encodeDirect(list) == encoded)
    println("Pass test")
  }

}
