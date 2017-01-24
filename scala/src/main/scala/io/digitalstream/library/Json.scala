/**
  * Created by sebby on 10/1/16.
  */
package io.digitalstream.library

import spray.json.DefaultJsonProtocol

case class Point(x: Float, y: Float)

trait PointProtocol extends DefaultJsonProtocol {
  implicit val pointFormat = jsonFormat2(Point)
}

object Json extends PointProtocol {

  def run(): Unit = {
    val point = Point(1.0f, 2.0f)
    val serialized = pointFormat.write(point);
    println(s"serialized = ${serialized.compactPrint}")
    val deserialized = pointFormat.read(serialized)
    println(s"deserialized = $deserialized")
  }
}
