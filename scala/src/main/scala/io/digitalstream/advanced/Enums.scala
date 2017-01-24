/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream.advanced

object Enums {

  sealed trait Option[+A]

  case object None extends Option[Nothing]

  case class Some[+A](get: A) extends Option[A]

  def run(): Unit = {
    val option = Some("string")
  }
}
