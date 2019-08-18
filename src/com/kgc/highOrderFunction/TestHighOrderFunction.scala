package com.kgc.highOrderFunction

/**
  * Created by cjr on 2018/8/20.
  */
object TestHighOrderFunction extends App{
  def apply(f : Int => String,v:Int)  = f(v)

  def layout[A](x:A) : String =  {
    "[" + x.toString + "]"
  }
  println(apply(layout,10))
}
