package com.imooc.sparktest

import java.text.MessageFormat

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object AScalaTest {


  def main(args: Array[String]): Unit = {

    for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")

    println()
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")

    println()

    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

    println(fac(5))

    def recursiveSum(args: Int*): Int = {
      if (args.length == 0) 0
      else args.head + recursiveSum(args.tail: _*)
    }

    println(recursiveSum(1 to 4: _*))

    val str = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])
    println(str)

    lazy val words = scala.io.Source.fromFile("/home/admin/log").mkString
    //    println(words)

    //    val result =
    //      for(a<-Try {StdIn.readLine("a: ").toInt};
    //        b<-Try {StdIn.readLine("b: ").toInt})
    //        yield a/b
    //    println(result)

    var a = new Array[Int](10)
    val s = Array("Hello", "World")
    s(0) = "Goodbye"
    println(s(0) + "," + s(1))

    val b = ArrayBuffer[Int]()
    b += 1
    b += (1, 2, 3, 5)
    b ++= Array(8, 13, 21)
    b.trimEnd(5)
    b.insert(2,6)
    b.toArray
//    b.toBuffer
    println(b.toString)

    for(i <-0 until a.length)
      println(s"$i: ${a(i)}")

    a = Array(1,2,3,4,5,6,7,8,9,10)
    val positionsToKeep = for (i<-a.indices if a(i) >=0) yield i
    for (j <- positionsToKeep.indices) a(j) = a(positionsToKeep(j))

    println(a.sum)

    var i = new Random().nextInt(10)
    println(i)

    println("New York".partition(_.isUpper))

    val symbols = Array("<","-",">")
    val counts = Array(2,10,2)
    val pairs = symbols.zip(counts)
    for ((s,n) <- pairs) print(s * n)

  }


}
