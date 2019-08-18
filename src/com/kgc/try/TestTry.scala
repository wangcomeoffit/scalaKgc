package com.kgc

import scala.util.{Try,Success,Failure}
/**
  * Created by cjr on 2018/8/20.
  */
object TestTry extends App{
  def divideBy(x: Int, y: Int): Try[Int] = {
    Try(x / y)
  }
//  println(divideBy(1, 1))
//  println(divideBy(1, 0))
//  divideBy(1, 1).foreach(println) // 1
//  divideBy(1, 0).foreach(println) // no print
//
  divideBy(1, 0) match {
    case Success(i) => println(i)
    case Failure(s) => println(s"Failed, message is: " + s.toString)
  }
}
