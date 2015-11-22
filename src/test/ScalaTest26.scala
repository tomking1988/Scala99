package test

import main.Scala26

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest26 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    println(Scala26.combinations(0, list))
  }

}
