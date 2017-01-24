/**
  * Created by sebby on 9/28/16.
  */
package io.digitalstream.library

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Promise
import scala.util.{Failure, Success}

object Futures {

  def run(): Unit = {
    Promise.successful("string").future
      .map(_.length)
      .onComplete {
        case Success(res) => println(s"promise succeeded $res")
        case Failure(ex) => println(s"promise failed $ex")
      }
  }
}
