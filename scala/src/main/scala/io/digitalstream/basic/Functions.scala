/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.basic

object Functions {

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def run(): Unit = {
    val result = sum(5, 4)
    println(s"sum is $result")
  }
}
