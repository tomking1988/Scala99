package test

import main.Scala03

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:49 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest03 {

  def main(args: Array[String]) = {
       test1()
  }

  def test1() = {
    val list = List(1,1,2,3,5,8)
    require(Scala03.nth(5, list) == 8)
    println("Pass test 1")
  }
}
