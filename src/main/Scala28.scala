package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/15/15
 * Time: 11:10 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala28 {
  def lsort[A](list: List[List[A]]) = {
     list map {
       elem => (elem, elem.length)
     } sortBy {
       tuple => tuple._2
     } map {
       elem => elem._1
     }
  }

  def lsortFreq[A](list: List[List[A]]) = {
    val freqs = Map(Scala10.encode(list.map{elem => elem.length}.sortWith (_ < _)).map( elem => elem.swap):_*)
    list.sortWith{(e1, e2) => freqs(e1.length) < freqs(e2.length)}

  }

}
