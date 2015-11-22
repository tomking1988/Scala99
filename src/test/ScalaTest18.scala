package test

import main.Scala18

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest18 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val sliced = List('d, 'e, 'f, 'g)

    require(Scala18.slice(3,7, list) == sliced)
    println("Pass test")
  }

}
