package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala23 {
  def randomSelect[A](num: Int, list: List[A]) = {
    val randomGenerator = new java.util.Random

    def randomSelector(num: Int, list: List[A]): List[A] = {
      if(num > 0){
        val (rest, e) = Scala20.removeAt(randomGenerator.nextInt(list.length), list)
        e :: randomSelector(num - 1, rest)
      }else{
        Nil
      }
    }

    randomSelector(num, list)
  }
}