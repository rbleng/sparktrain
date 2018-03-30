package com.imooc.sparktest

import java.text.SimpleDateFormat
import java.util.{Locale, TimeZone}

object test05 {

  def main(args: Array[String]): Unit = {

    val sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US)

    val str = "2018-02-27 06:57:32.0"

    sf.setTimeZone(TimeZone.getTimeZone("UTC"))

    val ts = sf.parse(str).getTime / 1000

    println(ts)
  }

}
