package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 10:20 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala26 {
  def combinations[A](num: Int, list: List[A]): List[List[A]] = {
    if(num > list.length) {
      Nil
    } else if (num == list.length) {
      List(list)
    } else {
      if(num > 0){
        val rest = combinations(num, list.tail)
        val subCombinations = combinations(num - 1, list.tail)
        val headCombinations = subCombinations match {
          case Nil => List(List(list.head))
          case a => a.map{elem => list.head :: elem}
        }
        headCombinations ::: rest
      } else {
        Nil
      }

    }
  }

}
