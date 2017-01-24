/**
  * Created by sebby on 9/25/16.
  */

pub fn run() {
    let option = Some("string");
    match option {
        Some(value) => println!("got value: {}", value),
        None => println!("got none"),
    }
}
