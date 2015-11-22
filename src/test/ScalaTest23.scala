package test

import main.Scala23

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest23 {
  def main(args: Array[String]) = {
      test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    println(Scala23.randomSelect(3, list))
  }

}
