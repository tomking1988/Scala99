package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/15/15
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala27 {
  def group[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = ns match {
    case Nil => List(Nil)
    case head :: tail =>{
      Scala26.combinations(head, ls).flatMap{
        elem =>  {
          group(tail, ls diff elem).map{sub => elem :: sub}}
      }
    }
  }

}
