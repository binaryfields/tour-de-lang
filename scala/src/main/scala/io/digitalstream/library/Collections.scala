/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.library

object Collections {

  def run(): Unit = {
    val names = Seq("alpha", "beta", "gamma")
    names
      .filter(_.startsWith("a"))
      .map(_.toUpperCase())
      .foreach(println)
  }
}
