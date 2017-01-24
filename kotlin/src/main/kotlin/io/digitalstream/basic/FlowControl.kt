/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.basic

object FlowControl {

  fun run(): Unit {
    val a = 5
    val b = 4
    val collection = arrayOf(1, 2, 3, 4, 5)
    val done = true

    val max = if (a > b) a else b

    for (item in collection) {
      // ...
    }

    while (!done) {
      // ...
    }
  }
}