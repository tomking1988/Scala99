package test

import main.Scala10

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest10 {
  def main(args: Array[String]) = {
      test
  }

  def test() = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    require(Scala10.encode(list) == encoded)
    println("Pass test")
  }

}
