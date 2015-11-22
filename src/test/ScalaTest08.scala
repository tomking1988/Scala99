package test

import main.Scala08

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest08 {
  def main(args: Array[String]) = {
        test()
  }

  def test() = {

    val list = List('a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e)
    val compressed = List('a, 'b, 'c, 'a, 'd, 'e)
    require(Scala08.compress(list) == compressed)
    println("Pass test 1")
  }
}
