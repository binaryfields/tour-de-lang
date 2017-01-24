/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.basic

object FlowControl {

  def run(): Unit = {
    val a = 5
    val b = 4
    val collection = Array(1, 2, 3, 4, 5)
    val done = true

    val max = if (a > b) a else b

    for (item <- collection) {
      // ...
    }

    while (!done) {
      // ...
    }
  }
}
