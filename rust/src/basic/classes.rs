/**
  * Created by sebby on 9/25/16.
  */

use std;

#[allow(dead_code)]
struct Circle {
    x: f64,
    y: f64,
    radius: f64,
}

#[allow(dead_code)]
impl Circle {
    fn new(x: f64, y: f64, radius: f64) -> Circle {
        Circle {
            x: x,
            y: y,
            radius: radius,
        }
    }

    fn area(&self) -> f64 {
        std::f64::consts::PI * (self.radius * self.radius)
    }
}

pub fn run() {
    let c = Circle::new(0.0, 0.0, 2.0);
    println!("circle {} {} {}", c.x, c.y, c.radius);
}

