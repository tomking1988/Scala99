package test

import main.Scala27

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/15/15
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest27 {
  def main(args: Array[String])={
    test
  }

  def test = {
    val list = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    println(Scala27.group(List(2, 2, 5), list))
  }

}
