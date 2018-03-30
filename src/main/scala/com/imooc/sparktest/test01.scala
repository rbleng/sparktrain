package com.imooc.sparktest

object test01 {

  class Person (val name: String, val age: Int){
    println("Just constructed another person")
    def description = s"$name is $age years old"
  }

  def main(args: Array[String]): Unit = {
    val a = new Person("rbleng",26)
    println(a.description)

  }

}
