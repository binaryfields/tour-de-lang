export function run(): void {
    let names = ["alpha", "beta", "gamma"];
    names
        .filter(it => it.startsWith("a"))
        .map(it => it.toUpperCase())
        .forEach(it => console.log(it));
}
