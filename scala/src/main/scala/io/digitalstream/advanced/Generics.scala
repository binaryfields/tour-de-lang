/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.advanced

object Generics {

  class Point[T](val x: T, val y: T) {
    def swap(): Point[T] = {
      new Point(y, x)
    }
  }

  def run(): Unit = {
    val p = new Point(0.0, 1.0).swap()
    println(s"point ${p.x} ${p.y}")
  }
}
