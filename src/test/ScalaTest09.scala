package test

import main.Scala09

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest09 {
  def main(args: Array[String]) = {
    test()

  }

  def test() = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val packedList =  List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    require(Scala09.pack(list) == packedList)
    println("Pass Test")
  }

}
