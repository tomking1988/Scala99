package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/29/15
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala11 {

  def encodeModified[A](list: List[A]): List[Any] = {
    Scala10.encode(list).map{elem => if(elem._1 == 1) elem._2 else elem }
  }

}
