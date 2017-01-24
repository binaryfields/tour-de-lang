/**
  * Created by sebby on 9/25/16.
  */

pub fn run() {
    let names = vec!["alpha", "beta", "gamma"];
    let result = names.iter()
        .filter(|&it| it.starts_with("a"))
        .map(|&it| it.to_uppercase());
    for item in result {
        println!("{}", item);
    }
}
