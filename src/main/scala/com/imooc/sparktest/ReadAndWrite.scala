package com.imooc.sparktest

import scala.io.Source

object ReadAndWrite extends App {
  val source = Source.fromFile("/Users/admin/data/data.log","UTF-8")

  val source1 = Source.fromURL("http://horstmann.com","UTF-8")

  val contents = source.mkString
  print(contents)

//  val iter = source.buffered
//  while(iter.hasNext){
//    if(iter.hasNext){
//      println(iter.next)
//    }
//  }

//  val lineIterator = source.getLines
//  for(i <- lineIterator)
//    println(i)
//  val lines = source.getLines().toArray
//  for(i <- lines)
//    print(i)

//  val contents = source.mkString
//  println(contents)


//  for(i <- source){
//    println(i)
//  }
  source.close

//  val age = scala.io.StdIn("how old are you? ")


}
