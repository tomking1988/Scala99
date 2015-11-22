package test

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
import main.arithmatic.S99Int._
object ScalaTest33 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
   require(5.isCoprimeTo(63) == true)
    println("Pass test 1")

    require(7.isCoprimeTo(63) == false)
    println("Pass test 2")
  }

}
