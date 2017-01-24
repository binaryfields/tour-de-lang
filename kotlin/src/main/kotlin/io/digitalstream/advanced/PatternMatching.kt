/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.advanced

import io.digitalstream.advanced.Enums.Option

object PatternMatching {

  fun run(): Unit {
    val option = Option.Some("string")
    when (option) {
      is Option.Some -> println("got value: ${option.value}")
      is Option.None<*> -> println("got none")
    }
  }
}