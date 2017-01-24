/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.advanced

object Generics {

  class Point<T>(val x: T, val y: T) {
    fun swap(): Point<T> {
      return Point(y, x)
    }
  }

  fun run(): Unit {
    val p = Point(0.0, 1.0).swap()
    println("point ${p.x} ${p.y}")
  }
}