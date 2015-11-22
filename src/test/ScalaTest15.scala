package test

import main.Scala15

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest15 {
  def main(args: Array[String]) = {
     test
  }

  def test = {
   val list = List('a, 'b, 'c, 'c, 'd)
    val duplicated = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    require(Scala15.duplicateN(3, list) == duplicated)
    println("Pass test")
  }

}
