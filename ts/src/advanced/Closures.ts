export function run(): void {
    const num = 5;
    let plus_num = (x: number) => x + num;
    console.log(`plus_num is ${plus_num(5)}`);
}
