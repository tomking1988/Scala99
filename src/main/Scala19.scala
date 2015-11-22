package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala19 {
  def rotate[A](n: Int, list: List[A]): List[A] = {
    val nBounded = if (list.isEmpty)  0 else n % list.length
    if(nBounded < 0)
      rotate(nBounded + list.length, list)
    else {
      (list drop nBounded) ::: (list take nBounded)
    }
  }

}
