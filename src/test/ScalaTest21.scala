package test

import main.Scala21

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest21 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd)
    val inserted = List('a, 'new, 'b, 'c, 'd)
    require(Scala21.insertAt('new, 1, list) == inserted)

    println("Pass test")
  }

}
