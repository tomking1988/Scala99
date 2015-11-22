package test

import main.Scala19

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest19 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val listRotateThree = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    val listRotateMinusTwo = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

    require(Scala19.rotate(3, list) == listRotateThree)
    println("Pass test 1")

    require(Scala19.rotate(-2, list) == listRotateMinusTwo)
    println("Pass test 2")
  }

}
