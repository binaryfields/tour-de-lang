function sum(a: number, b: number): number {
    return a + b;
}

export function run(): void {
    const result = sum(5, 4);
    console.log(`sum is ${result}`);
}

