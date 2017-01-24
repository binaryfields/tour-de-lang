/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.library

object Collections {

  fun run(): Unit {
    val names = listOf("alpha", "beta", "gamma")
    names
        .filter { it.startsWith("a") }
        .map(String::toUpperCase)
        .forEach(::println)
  }
}
