package test

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
import main.arithmatic.S99Int._
object ScalaTest37 {

  def main(args: Array[String]) = {
    test
  }

  def test = {
    require(10.totientEfficient == 4)
    println("pass test")

  }
}
