package com.kgc.genericlass

/**
  * Created by cjr on 2018/8/20.
  */
object TestGenericClass extends App{
  class Stack[A] {
    private var elements: List[A] = Nil
    def push(x: A) { elements = x :: elements }
    def peek: A = elements.head
    def pop(): A = {
      val currentTop = peek
      elements = elements.tail
      currentTop
    }
  }
  /**
    * Stack 类的实现把任意类型 A 作为参数。这意味着基础列表
    * var elements: List[A] = Nil 只能存储类型为 A 的元素。
    * def push 程序只能接受类型为 A 的对象
    * （注意：elements = x :: elements 是将elements重新分配到一个新的列表，
    * 该列表是通过将 x 添加到当前 elements 创建的）
    */

  val stack = new Stack[Int]
  stack.push(1)
  stack.push(2)
  println(stack.pop)  // prints 2
  println(stack.pop)  // prints 1
}
