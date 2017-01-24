/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.basic

object Functions {

  fun sum(a: Int, b: Int): Int {
    return a + b
  }

  fun run(): Unit {
    val result = sum(5, 4)
    println("sum is $result")
  }
}
