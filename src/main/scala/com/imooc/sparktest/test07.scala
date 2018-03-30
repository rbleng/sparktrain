package com.imooc.sparktest

import java.nio.file._

import com.alibaba.fastjson.JSON

import scala.math._

object test07{

  def main(args: Array[String]): Unit = {
    val str = "{\"snr\":4.0,\"port\":21.0,\"sf_used\":12.0,\"appId\":\"A1515692375390\",\"time_on_air_ms\":827.392,\"freq\":4.725E+8,\"device_redundancy\":1.0,\"deveui\":\"0004a30b001a90f5\",\"gtw_info\":[{\"snr\":4.0,\"gtw_id\":\"000cc6fffe816020\",\"rssi\":-82.0},{\"snr\":-9.0,\"gtw_id\":\"000cc6fffe816073\",\"rssi\":-111.0},{\"snr\":-12.8,\"gtw_id\":\"000cc6fffe816092\",\"rssi\":-119.0}],\"dataDecode\":{\"humidity\":88.11,\"temperature\":15.37},\"timestamp\":\"2018-03-19T00:40:32.936Z\",\"id\":1521420032936,\"name\":\"???????456??\",\"longitude\":121.466568,\"rssi\":-82.0,\"fcnt\":61.0,\"ExtraProperty\":[{\"id\":\"E1519374283059\",\"name\":\"temperature\",\"value\":\"15.97\",\"devId\":\"D1516350859213\"},{\"id\":\"E1519374283120\",\"name\":\"humidity\",\"value\":\"85.47\",\"devId\":\"D1516350859213\"}],\"live\":true,\"dr_used\":\"SF12BW125\",\"status\":1,\"devaddr\":269995486,\"cr_used\":\"4/5\",\"dataFrame\":\"BgEiaw==\",\"decrypted\":true,\"appName\":\"???????\",\"address\":\"\",\"latitude\":31.320227,\"devId\":\"D1516350859213\"}"
    val a = JSON.parseObject(str).getString("dataDecode")

    val b = JSON.parseObject(a)
    println(b.getString("humidity"))

  }

}
