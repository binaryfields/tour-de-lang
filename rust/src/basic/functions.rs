/**
  * Created by sebby on 9/25/16.
  */

fn sum(a: i32, b: i32) -> i32 {
    a + b
}

pub fn run() {
    let result = sum(5, 4);
    println!("sum is {}", result);
}
