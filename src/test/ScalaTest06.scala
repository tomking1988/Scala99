package test

import main.Scala06

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
object ScalaTest06 {

  def main(args: Array[String]) = {

    test()
  }

  def test() = {
    val list1 = Nil
    require(Scala06.isPalindrome(list1) == true)
    println("Pass test 1")

    val list2 = List(1)
    require(Scala06.isPalindrome(list2) == true)
    println("Pass test 2")

    val list3 = List(1,1)
    require(Scala06.isPalindrome(list3) == true)
    println("Pass test 3")

    val list4 = List(1,2)
    require(Scala06.isPalindrome(list4) == false)
    println("Pass test 4")

    val list5 = List(1,2, 1)
    require(Scala06.isPalindrome(list5) == true)
    println("Pass test 5")

    val list6 = List(1, 2, 3)
    require(Scala06.isPalindrome(list6) == false)
    println("Pass test 6")

    val list7 = List(1, 2, 2, 1)
    require(Scala06.isPalindrome(list7) == true)
    println("Pass test 7")
  }
}
