/**
 * Created by sebby on 9/25/16.
 */
package io.digitalstream.basic

import io.digitalstream.basic.Utils.foo as bar

object Modules {

  fun run(): Unit {
    Utils.foo()
  }
}

object Utils {
  fun foo(): Unit {
    println("called `deeply::nested::foo()`")
  }
}
