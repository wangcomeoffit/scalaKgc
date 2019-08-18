package com.kgc.anonymousFuntion

/**
  * Created by cjr on 2018/8/20.
  */
object TestAnoymousFunction {
  val rawList = List(1,2,3,4,5,6)
  rawList.map( x => x+1)//每个元素+1
  rawList.filter(_>3) //取大于3的数
  println(rawList.map(x => x*2)) //将所有数乘2
}
