package main.arithmatic

import main.Scala10

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/22/15
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
class S99Int(val start: Int) {
  import S99Int._

  def isPrime :Boolean = {
    (start > 1) && (primes.takeWhile{_ <= Math.sqrt(start)}.forall(start %_ != 0))
  }

  def isCoprimeTo(other: Int) = {
    gcd(start, other) == 1
  }

  def totient = {
    (1 to start) filter (start.isCoprimeTo(_)) length
  }

  def totientEfficient = {
    start.primeFactorMultiplicity.foldLeft(1){
      case (acc, (root, exponential)) => {acc * (root - 1) * Math.pow(root - 1, exponential - 1).toInt}
    }
  }

  def primeFactors = {
    def primeFactorsHelper(num: Int, primes: Stream[Int]): List[Int] = {
      if(num.isPrime){
        List(num)
      }else if(num % primes.head == 0){
        primes.head :: primeFactorsHelper(num / primes.head, primes)
      } else {
        primeFactorsHelper(num, primes.tail)
      }
    }
    primeFactorsHelper(start, primes)
  }

  def primeFactorMultiplicity = {
    Scala10.encode(start.primeFactors).map(_.swap).toMap
  }
}

object S99Int {
  implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

  val primes =Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })

  def gcd(a: Int, b: Int): Int = {
    if(a == 0){
      b
    } else {
      gcd(b%a, a)
    }
  }

}
