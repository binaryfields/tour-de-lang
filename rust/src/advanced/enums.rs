/**
  * Created by sebby on 9/25/16.
  */
#[allow(dead_code)]
enum Option<T> {
    Some(T),
    None,
}

#[allow(unused_variables)]
pub fn run() {
    let option = Option::Some("string");
}
