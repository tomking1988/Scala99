package test

import main.Scala11

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest11 {
      def main(args: Array[String]) = {
            test
      }

  def test() = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    require(Scala11.encodeModified(list) == encoded)
    println("Pass test")


  }
}
