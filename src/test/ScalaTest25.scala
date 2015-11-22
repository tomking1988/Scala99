package test

import main.Scala25

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 10:16 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest25 {
  def main(args: Array[String]) = {
    test
  }
  def test = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    println(Scala25.randomPermute(list))
  }

}
