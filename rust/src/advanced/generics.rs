/**
  * Created by sebby on 9/25/16.
  */

struct Point<T: Clone> {
    x: T,
    y: T,
}

impl<T: Clone> Point<T> {
    fn swap(&self) -> Point<T> {
        Point { x: self.y.clone(), y: self.x.clone() }
    }
}

pub fn run() {
    let p = Point { x: 0.0, y: 1.0 };
    let p2 = p.swap();
    println!("point {} {}", p2.x, p2.y);
}
