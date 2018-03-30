package com.imooc.sparktest

object test09 {

  def main(args: Array[String]): Unit = {

    val arr = List(1,2,3,4,5)
    val b = arr.flatMap(x => x match {
      case 3 => List("a","b")
      case _ => List(x*2)
    })

    println(b)
  }

}
