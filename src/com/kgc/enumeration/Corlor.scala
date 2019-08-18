package com.kgc.enumeration

/**
  * Created by cjr on 2018/8/20.
  * 继承枚举类Enumeration可以在成员中使用无参方法Value给每个枚举成员赋值。
    默认的Value方法会按变量名生成枚举名和并自动从0开始生成枚举ID，
    若需要手动设定枚举名称和枚举ID则可以使用Value方法的重载
    Value(id: Int, name: Strig)
  */
object Corlor extends Enumeration{
  //自动赋值枚举成员
  val Red,Green,Blue = Value
  /*
  * 相当于分别初始化：
  * val Red = Value
  * val Green = Value
  * val Blue = Value
  */
  // 手动使用 Value(id: Int, name: String) 方法手动进行id和name的设置
  // 使用重载有參版本的Value(id: Int, name: String)不能一次性给多个枚举成员赋值，
  // 会编译报错(id冲突)
  val White = Value(100, "white")
  val Black = Value(200, "black")

  def showEnum(color: Corlor.Value) = println("ID: " + color.id + ", Str: " + color)

  def showAll() = Corlor.values.foreach(color => println("ID: " + color.id + ", Str: " + color))
}
object testEnum extends App{
  //通过枚举ID访问枚举
  //Corlor.showEnum(Corlor(200))
  // 通过枚举名称访问枚举
//  Corlor.showEnum(Corlor withName("Green"))
  Corlor.showAll()
}
