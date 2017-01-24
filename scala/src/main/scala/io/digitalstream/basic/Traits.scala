/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.basic

object Traits {

  trait Similarity {
    def isSimilar(x: Any): Boolean

    def isNotSimilar(x: Any): Boolean = !isSimilar(x)
  }

  def run(): Unit = {

  }
}
