/**
  * Created by sebby on 9/25/16.
  */

pub fn run() {
    let hello = "Hello ".to_string();
    let world = "world!".to_string();
    let hello_world = hello + &world;
    println!("{}", hello_world);
}
