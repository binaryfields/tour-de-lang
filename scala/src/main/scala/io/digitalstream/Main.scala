/**
  * Created by sebby on 9/25/16.
  */
package io.digitalstream

import io.digitalstream.advanced._
import io.digitalstream.basic._
import io.digitalstream.library._

object Main {

  def main(args: Array[String]) = {
    // Language Basics
    Variables.run()
    FlowControl.run()
    Functions.run()
    Classes.run()
    Traits.run()
    Modules.run()
    // Language Advanced
    Closures.run()
    Generics.run()
    Enums.run()
    PatternMatching.run()
    // Library
    Arrays.run()
    Collections.run()
    Futures.run()
    Json.run()
    Strings.run()
    Tuples.run()
  }
}
