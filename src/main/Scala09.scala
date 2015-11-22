package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala09 {

  def pack[A](list: List[A]): List[List[A]] = {
    if(list.isEmpty) {
     List(List())
    } else {
      val (packed, rest) = list span (_ == list.head)
      if(rest == Nil) {
        List(packed)
      } else {
        packed :: pack(rest)
      }
    }
  }
}
