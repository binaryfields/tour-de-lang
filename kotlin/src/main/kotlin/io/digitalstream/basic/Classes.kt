/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.basic

object Classes {

  class Circle(val x: Double, val y: Double, val radius: Double) {
    companion object {
      fun create(): Circle = Circle(0.0, 0.0, 2.0)
    }

    fun area(): Double {
      return Math.PI * (radius * radius)
    }
  }

  fun run(): Unit {
    val c = Circle.create()
    println("circle ${c.x} ${c.y} ${c.radius}")
  }
}