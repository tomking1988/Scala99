package test

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */

import main.arithmatic.S99Int
object ScalaTest32 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
    require(S99Int.gcd(36, 63) == 9)
    println("Pass test 1")

    require(S99Int.gcd(0, 6) == 6)
    println("Pass test 2")

    require(S99Int.gcd(6, 0) == 6)
    println("Pass test 3")

  }

}
