/**
  * Created by sebby on 9/25/16.
  */

use self::deeply::nested::foo as bar;

mod deeply {
    pub mod nested {
        pub fn foo() {
            println!("called `deeply::nested::foo()`")
        }
    }
}

pub fn run() {
    bar();
}
