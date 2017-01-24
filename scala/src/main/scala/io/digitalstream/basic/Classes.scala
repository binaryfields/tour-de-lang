/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.basic

object Classes {

  object Circle {
    def apply(x: Double, y: Double, radius: Double): Circle = {
      new Circle(x, y, radius)
    }
  }

  class Circle(val x: Double, val y: Double, val radius: Double) {

    def area(): Double = {
      Math.PI * (radius * radius)
    }
  }

  def run(): Unit = {
    val c = Circle(0.0, 0.0, 2.0)
    println(s"circle ${c.x} ${c.y} ${c.radius}")
  }
}
