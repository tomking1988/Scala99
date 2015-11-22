package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala13 {
  def encodeDirect[A](list: List[A]) : List[(Int, A)] = {
     if(list.isEmpty) {
       Nil
     } else {
       val (packed, rest) = list span { _ == list.head}
       (packed.length, packed.head) :: encodeDirect(rest)
     }
  }

}
