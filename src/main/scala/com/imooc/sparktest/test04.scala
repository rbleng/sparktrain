package com.imooc.sparktest

import com.alibaba.fastjson.JSON

object test04 {

  def main(args: Array[String]): Unit = {
    val str = "{\"result\":[{\"TASKID\":\"1\",\"LABCODE\":\"1212212\",\"COMPANYNAME\":\"\\u4e0a\\u6d77\\u4eea\\u7535\",\"SECTION\":\"\\u9752\\u83dc\",\"LABID\":\"121wss2212\",\"PRODUCTNAME\":\"\\u9752\\u83dc\",\"ITEM\":\"\\u519c\\u6b8b\",\"RESULT\":\"1\",\"SAMPLES\":[{\"SAMPLENO\":\"111\",\"VALUE\":\"12.3\",\"TESTTIME\":\"2012-01-02 09:00:00\",\"LIMIT_MIN\":\"0\",\"EQUIPMENTNAME\":\"SGS-68\",\"RESULT\":1,\"STANDNAME\":\"NY/T 743-2012 \\u7eff\\u53f6\\u7c7b\\u852c\\u83dc\",\"METHOD\":\"GB\\uff0fT5009.15 \\u6570\\u503c\",\"UNIT\":\"mg\",\"LIMIT_MAX\":\"1\"},{\"SAMPLENO\":\"222\",\"VALUE\":\"12.3\",\"TESTTIME\":\"2012-01-02 09:00:00\",\"LIMIT_MIN\":\"0\",\"EQUIPMENTNAME\":\"SGS-68\",\"RESULT\":1,\"STANDNAME\":\"NY/T 743-2012 \\u7eff\\u53f6\\u7c7b\\u852c\\u83dc\",\"METHOD\":\"GB\\uff0fT5009.15 \\u6570\\u503c\",\"UNIT\":\"mg\",\"LIMIT_MAX\":\"1\"}],\"TASKNO\":\"898b89542d233c01542d233c190000\",\"CLASS\":\"\\u9752\\u83dc\"},{\"TASKID\":\"2\",\"LABCODE\":\"1212212\",\"COMPANYNAME\":\"\\u4e0a\\u6d77\\u4eea\\u7535\",\"SECTION\":\"\\u9752\\u83dc\",\"LABID\":\"121wss2212\",\"PRODUCTNAME\":\"\\u9752\\u83dc\",\"ITEM\":\"\\u519c\\u6b8b\",\"RESULT\":\"1\",\"SAMPLES\":[{\"SAMPLENO\":\"111\",\"VALUE\":\"12.3\",\"TESTTIME\":\"2012-01-02 09:00:00\",\"LIMIT_MIN\":\"0\",\"EQUIPMENTNAME\":\"SGS-68\",\"RESULT\":1,\"STANDNAME\":\"NY/T 743-2012 \\u7eff\\u53f6\\u7c7b\\u852c\\u83dc\",\"METHOD\":\"GB\\uff0fT5009.15 \\u6570\\u503c\",\"UNIT\":\"mg\",\"LIMIT_MAX\":\"1\"},{\"SAMPLENO\":\"222\",\"VALUE\":\"12.3\",\"TESTTIME\":\"2012-01-02 09:00:00\",\"LIMIT_MIN\":\"0\",\"EQUIPMENTNAME\":\"SGS-68\",\"RESULT\":1,\"STANDNAME\":\"NY/T 743-2012 \\u7eff\\u53f6\\u7c7b\\u852c\\u83dc\",\"METHOD\":\"GB\\uff0fT5009.15 \\u6570\\u503c\",\"UNIT\":\"mg\",\"LIMIT_MAX\":\"1\"}],\"TASKNO\":\"898b89542d233c01542d233c190001\",\"CLASS\":\"\\u9752\\u83dc\"}]}"
    val a = JSON.parseObject(str).getString("result").flatMap(result => {

      result.toString
    })

    println(a)



  }

}
