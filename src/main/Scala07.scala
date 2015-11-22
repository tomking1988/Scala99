package main

/**
 * Created with IntelliJ IDEA.
 * User: xin
 * Date: 10/27/15
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
object Scala07 {

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case listElem: List[_] => flatten(listElem)
    case singleElem => List(singleElem)
  }
}
