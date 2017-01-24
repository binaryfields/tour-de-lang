/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.advanced

object PatternMatching {

  def run(): Unit = {
    val option = Option("string")

    option match {
      case Some(value) => println(s"got value: $value")
      case None => println("got none")
    }
  }
}
