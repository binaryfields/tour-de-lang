/**
  * Created by sebby on 9/26/16.
  */
package io.digitalstream.basic {

  import self.deeply.nested.Utils.{foo => bar}

  object Modules {
    def run(): Unit = {
      bar()
    }
  }

  package self.deeply.nested {

    object Utils {
      def foo(): Unit = {
        println("called `deeply::nested::foo()`")
      }
    }

  }

}
