package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala03 {

  def nth[A](n: Int, list: List[A]): A = {
    if(n == 0){
       list match {
         case head::_ => head
         case Nil => throw new NoSuchElementException
       }
    } else {
      list match {
        case head :: tail => nth(n-1, tail)
        case Nil => throw new NoSuchElementException
      }
    }


  }
}
