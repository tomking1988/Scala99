package test

import main.Scala28

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/15/15
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest28 {
  def main(args: Array[String]) = {
    test
  }

  def test = {

    val list = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    println(Scala28.lsort(list))
  }

}
