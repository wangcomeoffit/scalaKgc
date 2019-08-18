package com.kgc.option

/**
  * Created by cjr on 2018/8/20.
  */
object TestOption extends App{
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e : Exception => None
    }
  }
  toInt("L23") match {
    case Some(v) => println(v)
    case _ => println("it is Stirng")
  }
}
