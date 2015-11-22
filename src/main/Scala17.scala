package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/30/15
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala17 {
  def split[A](num: Int, list: List[A]): (List[A], List[A]) = (num, list) match {
    case (_, Nil) => (Nil, Nil)
    case (0, list) => (Nil, list)
    case (num, head :: tail) => {
      val (part1, part2) = split(num - 1, tail)
      (head :: part1, part2)
    }
  }

}
