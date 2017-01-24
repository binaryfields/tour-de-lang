/**
  * Created by sebby on 9/25/16.
  */

extern crate futures;
#[macro_use]
extern crate serde_derive;
extern crate serde_json;

mod basic;
mod advanced;
mod library;

fn main() {
    // Language Basics
    basic::variables::run();
    basic::flow_control::run();
    basic::functions::run();
    basic::classes::run();
    basic::modules::run();
    // Language Advanced
    advanced::closures::run();
    advanced::generics::run();
    advanced::enums::run();
    advanced::pattern_matching::run();
    // Library
    library::arrays::run();
    library::collections::run();
    library::futures::run();
    library::json::run();
    library::strings::run();
    library::tuples::run();
}
