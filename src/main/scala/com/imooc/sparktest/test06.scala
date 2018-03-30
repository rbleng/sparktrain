package com.imooc.sparktest

import com.alibaba.fastjson.{JSON, JSONObject}

import scala.util.parsing.json.JSONArray

object test06 {

  def main(args: Array[String]): Unit = {

    val str = """{"data":[{"cholesterolState":0,"lowPressure":77,"rightEyesightState":0,"weight":0,"templature":0,"lowPressureState":3,"pulseState":3,"rightEyesight":0,"pulse":78,"sex":2,"bloodSugar":0,"bloodSugarType":0,"basalMetabolismState":0,"templatureState":0,"tcHdl":0,"totalCholesterolState":0,"totalCholesterol":0,"reportNo":"","weightState":0,"triglycerides":0,"physical":[],"fatRateLines":[],"heightPressure":125,"physicalResult":"","ecgs":"","hipCircumference":0,"photoPath":"","heightPressureLines":["2018-03-23|125"],"fat":"0.0","bloodSugarState":0,"build":"--","leftEyesightState":0,"ytBmi":0,"waterRate":0,"basalMetabolism":0,"tclHdlState":0,"heightLipoprotein":0,"uricAcid":0,"lowLipoprotein":0,"fatRate":0,"ecgRateResult":"-","hwBmi":0,"heightLipoproteinState":0,"ecgRate":0,"water":"0.0","phone":"","birthday":"1958-04-17","heightPressureState":3,"reportId":"13e00bb2-9af4-457a-8831-1d2b0215a20c","fatRateState":0,"oxygenSaturation":0,"triglyceridesState":0,"height":0,"createTime":"2018-03-23 10:35:32","userName":"\u803f\u7389\u537f","pulseRateState":0,"lowLipoproteinState":0,"uricAcidState":0,"lowPressureLines":["2018-03-23|77"],"age":59,"idCard":"310108195804174885","ytBmiState":0,"ecgRateState":0,"leftEyesight":0,"cholesterol":0,"pulseRate":0,"oxygenSaturationState":0,"waterRateState":0,"waistCircumference":0,"hwBmiState":0,"machineId":"7cafdf0067269729b8bb5e247153063c"}]}"""
    val obj = JSON.parseArray(str)
//    val map = getMapFromJSON(obj).flatMap(obj =>{
//
//      val a = obj
//      Some(a)
//    })


    println(obj)
  }

  def getMapFromJSON(json: JSONObject): Map[String, String] = {
    var data: Map[String, String] = Map()
    for (k <- json.keySet.toArray) {
      if (json.get(k) != null)
        data += (k.toString -> json.get(k).toString)
    }
    data
  }
}
