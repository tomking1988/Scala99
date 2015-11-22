package test

import main.Scala17

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest17 {
  def main(args: Array[String]) = {
      test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val splitted = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

    require(Scala17.split(3, list) == splitted)

    println("Pass test")
  }

}
