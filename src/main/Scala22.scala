package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala22 {

  def range(start: Int, end: Int) :List[Int] = {
    if(start <= end){
      start ::  range(start+1, end)
    } else {
      Nil
    }
  }

}
