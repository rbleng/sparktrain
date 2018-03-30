package com.imooc.sparktest

import com.alibaba.fastjson.JSON

object test08 {

  def main(args: Array[String]): Unit = {

    val str = "{\"appId\":\"A1520918574615\",\"roomAddress\":\"临汾路380弄5号楼 地下室泵房\",\"deveui\":\"00303\",\"properties\":0,\"appName\":\"水质(水浊度)\",\"timestamp\":\"2018-03-27T11:47:37.000Z\",\"id\":\"D1521446176173\",\"name\":\"临汾路380弄5号楼 地下室泵房\",\"longitude\":0.0,\"latitude\":0.0,\"devId\":\"D1521446176173\",\"appID\":\"A1520918574615\",\"ExtraProperty\":[{\"id\":\"E1522122456706\",\"name\":\"Rtd\",\"value\":\"1.102\",\"serialVersionUID\":\"\",\"devId\":\"D1521446176173\"}]}"
    val obj = JSON.parseObject(str)
    val a = "c" match {
      case "c" => {
        var Rtd = ""
        val jsonArr = obj.getJSONArray("ExtraProperty")
        for (i <- 0 until jsonArr.size){
          if (jsonArr.getJSONObject(i).getString("name") == "Rtd")
            Rtd = jsonArr.getJSONObject(i).getString("value")
        }
        Rtd
      }
    }

    print(a)
  }

}
