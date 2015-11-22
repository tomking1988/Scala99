package test

import main.Scala14

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest14 {
  def main(args: Array[String]) = {
     test
  }

  def test = {
    val list = List('a, 'b, 'c, 'c, 'd)
    val duplicated = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

    require(Scala14.duplicate(list) == duplicated)

    println("Pass test")
  }

}
