package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala08 {
  def compress[A](list: List[A]) = {
    list.foldRight(List[A]()){
      (elem, acc) => {
        if(acc.isEmpty || elem != acc.head){
          elem :: acc
        } else {
          acc
        }
      }
    }
  }

}
