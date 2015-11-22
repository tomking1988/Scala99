package test

import main.Scala16

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest16 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val dropped = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

    require(Scala16.drop(3, list) == dropped)

    println("Pass test")
  }

}
