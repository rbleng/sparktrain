package com.imooc.sparktest

import scala.collection.mutable.ArrayBuffer

object test11 {

  def main(args: Array[String]): Unit = {
    var a = Map("1" -> "a")
    a += ("2" -> "b")
    a += ("3" -> "c")

    for (i <- a.keySet){
      if(a(i) == "1" || "2"){
        println(a(i))
      }
    }


  }

}
