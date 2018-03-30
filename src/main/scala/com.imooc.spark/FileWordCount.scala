package com.imooc.spark

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * 使用Spark Streaming处理文件系统(local/hdfs)的数据
  */
object FileWordCount {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local").setAppName("FileWordCount")
    val ssc = new StreamingContext(sparkConf, Seconds(5))

    // 重复使用的代码
    val lines = ssc.textFileStream("file:///Users/admin/data/imooc/ss/")  //local
//    val lines = ssc.textFileStream("file:////Users/admin/data/")  //hdfs
    val result = lines.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)
    result.print()

    ssc.start()
    ssc.awaitTermination()


  }

}
