package test

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
import main.arithmatic.S99Int._
object ScalaTest35 {
  def main(args: Array[String]) = {
     test
  }

  def test = {
    val factors = List(2,2,2,3,5)
    val multiple = factors.foldLeft(1)((a,b) => a*b)

    require(multiple.primeFactors == factors)
    println("Pass test")
  }

}
