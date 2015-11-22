package test

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
import main.arithmatic.S99Int._
object ScalaTest36 {
  def main(args: Array[String]) = {
    test
  }
  def test = {
    val factors = Map(3->2, 5->1, 7->1)
    val num = factors.foldLeft(1){case (acc, (root, exponential)) => acc * Math.pow(root, exponential).toInt}
    require(num.primeFactorMultiplicity == factors)
    println("Pass Test")
  }

}
