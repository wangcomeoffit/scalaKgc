package com.kgc

/**
  * Created by cjr on 2018/8/20.
  */
import scala.collection.immutable._
object TestWordCount extends App{
  var text = "is x split aaaa is"
  val word_count = text.split(" ").foldLeft(Map.empty[String, Int])((map, word) => map + (word -> (map.getOrElse(word, 0) + 1)))
  val t = Tuple2("x","y")
  println()
}
