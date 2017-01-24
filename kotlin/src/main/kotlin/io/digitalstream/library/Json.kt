/**
 * Created by sebby on 10/1/16.
 */
package io.digitalstream.library

import com.github.salomonbrys.kotson.fromJson
import com.google.gson.Gson

data class Point(val x: Float, val y: Float)

object Json {

  fun run() {
    val gson = Gson()
    val point = Point(1.0f, 2.0f)
    val serialized = gson.toJson(point)
    println("serialized = $serialized")
    val deserialized = gson.fromJson<Point>(serialized)
    println("deserialized = $deserialized")
  }
}
