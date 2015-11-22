package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 11/8/15
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala24 {
  def lotto(num: Int, length: Int) = {
    if(num <= length) {
      Scala23.randomSelect(num, List.range(1, length))
    }else{
      Nil
    }
  }

}
