package test

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
import main.arithmatic.S99Int.int2S99Int

object ScalaTest31 {
  def main(args: Array[String]) = {
    test
  }

  def test = {
      require(7.isPrime == true)
    println("Pass Test")
  }

}
