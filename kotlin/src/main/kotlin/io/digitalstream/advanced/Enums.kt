/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.advanced

object Enums {

  sealed class Option<T> {
    class None<T> : Option<T>()
    class Some<T>(val value: T) : Option<T>()
  }

  fun run(): Unit {
    val option = Option.Some("string")
  }
}