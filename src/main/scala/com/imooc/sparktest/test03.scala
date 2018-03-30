package com.imooc.sparktest

object test03 extends App {

  class Person {

    val name ="rbleng"
    override def toString: String = s"${getClass.getName}[name=$name]"
  }
  val a = new Person
  print(a.toString)
}
