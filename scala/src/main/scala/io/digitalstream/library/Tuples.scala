/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.library

object Tuples {

  def run(): Unit = {
    val tuple = (1, "hello")
    val tuple2: Tuple2[Int, String] = (1, "hello")
    println(s"tuple ${tuple._1}, ${tuple._2}")
  }
}
