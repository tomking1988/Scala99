package test

import main.Scala04

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:57 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest04 {

  def main(args: Array[String]) = {

    test()
  }

  def test() = {
    val list1 = List(1,1,2,3,5,8)
    require(Scala04.length(list1) == 6)
    println("Pass test 1")

    val list2 = Nil
    require(Scala04.length(list2) == 0)
    println("Pass test 2")
  }
}
