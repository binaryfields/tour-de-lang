/**
  * Created by sebby on 9/25/16.
  */

use futures;
use futures::*;

#[allow(unused_must_use)]
pub fn run() {
    futures::finished::<String, u32>("string".to_string())
        .map(|res| res.len())
        .then(|res| {
            match res {
                Ok(res) => println!("promise succeeded {}", res),
                Err(ex) => println!("promise failed {}", ex),
            }
            res
        })
        .wait();
}