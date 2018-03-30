package com.imooc.sparktest

object RegEx {

  def main(args: Array[String]): Unit = {

    val numPattern = "[0-9]+".r
    val charPattern = "[a-z]+".r
    val wsnumwsPattern = """\s+[0-9]+\s+""".r

    for (matchString <- numPattern.findAllIn("99 bottles,98 bottles"))
      println(matchString)

    for (matchString <- charPattern.findAllIn("99 bottles,98 bottles"))
      println(matchString)

    val matches = numPattern.findAllIn("99 bottles,98 bottles").toArray
    for (i <- matches)
      println(i)

    val firstMatch = wsnumwsPattern.findFirstIn("99 bottles,98 bottles")
    println(firstMatch)

    // 首尾锚定anchor
    val anchoredPattern = "^[0-9]+$".r
    val str = "99 bottles,98 bottles 99"
    if (anchoredPattern.findFirstIn(str) != None)
      println(1)
    else
      println(0)
    if (str.matches("[0-9]+"))
      println(1)
    else
      println(0)

    numPattern.replaceFirstIn("99 bottles,98 bottles 99", "XX")
    numPattern.replaceAllIn("99 bottles,98 bottles 99", "XX")
    numPattern.replaceSomeIn("99 bottles,98 bottles 99", m => if (m.matched.toInt % 2 == 0) Some("XX") else None)

    val varPattern = """\$[0-9]+""".r

    def format(message: String, vars: String*) = varPattern.replaceSomeIn(message, m => vars.lift(m.matched.tail.toInt))

    val a = format("At $1, there was $2 on $0.",
      "planet 7", "12:30 pm", "a disturbance of the force")
    println(a)

    // 正则表达式组
    val numitemPattern = "([0-9]+) ([a-z]+)".r
    for (m <- numitemPattern.findAllMatchIn("99 bottles,98 bottles 99"))
      println(m.group(1))

    // 把正则表达式对象当作提取器
    val numitemPattern(num,item) = "99 bottles"
    println(num,item)
    for (numitemPattern(num,item) <- numitemPattern.findAllIn("99 bottles,98 bottles 99"))
      println(num,item)

  }

}
