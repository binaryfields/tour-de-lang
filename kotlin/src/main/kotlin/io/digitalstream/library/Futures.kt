/**
 * Created by sebby on 9/28/16.
 */
package io.digitalstream.library

import java.util.concurrent.CompletableFuture

object Futures {

  fun run(): Unit {
    CompletableFuture.completedFuture("string")
        .thenApply(String::length)
        .whenComplete { res, ex ->
          if (ex == null) {
            println("promise succeeded $res")
          } else {
            println("promise failed $ex")
          }
        }
  }
}
