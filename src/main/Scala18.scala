package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/1/15
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala18 {
  def slice[A](start: Int, end: Int, list: List[A]) = {
    if(start < 0 || start >= list.length) {
      Nil
    } else if (end < 0 || end > list.length) {
      Nil
    } else {
      list.take(end).takeRight(end - start)
    }




  }

}
