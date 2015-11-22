package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/26/15
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala02 {

  def penultimate[A](list: List[A]) : A= list match{
    case head :: _ :: Nil => head
    case _ :: tail => penultimate (tail)
    case _ => throw new NoSuchElementException
  }
}
