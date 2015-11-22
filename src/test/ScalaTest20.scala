package test

import main.Scala20
/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest20 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd)
    val removed = (List('a, 'c, 'd),'b)

    require(Scala20.removeAt(1, list) == removed)

    println("Pass test")
  }

}
