/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.library

object Tuples {

  fun run(): Unit {
    val tuple = Pair(1, "hello")
    val tuple2: Pair<Int, String> = Pair(1, "hello")
    println("tuple ${tuple.first}, ${tuple.second}")
  }
}
