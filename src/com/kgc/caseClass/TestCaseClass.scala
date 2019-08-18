package com.kgc.caseClass

/**
  * Created by cjr on 2018/8/20.
  */
abstract class Person

case class Student(name: String, sno: Int) extends Person

case class Teacher(name: String, tno: Int) extends Person

case class None(name: String) extends Person
object TestCaseClass extends App {
  def caseClassMatch(p: Person) = p match {
    case Student(name, sno) => println(name + " is a student,sno is:" + sno)
    case Teacher(name, tno) => println(name + " is a teacher,tno is:" + tno)
    case None(name) => println("None matched")
  }
  val p = Student("yy", 20151214)
  caseClassMatch(p)
}
