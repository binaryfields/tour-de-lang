/**
  * Created by sebby on 9/25/16.
  */
#[allow(unused_variables)]
pub fn run() {
    let tuple = (1, "hello");
    let tuple2: (i32, &str) = (1, "hello");
    println!("tuple {}, {}", tuple.0, tuple.1)
}
