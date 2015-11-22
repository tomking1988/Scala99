package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala10 {

  def encode[A](list: List[A]): List[(Int, A)] = {
    val packedList = Scala09.pack(list)
    packedList.map(elem => (elem.length, elem.head))
  }
}
