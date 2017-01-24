class Point<T> {
    x: T;
    y: T;

    constructor(x: T, y: T) {
        this.x = x;
        this.y = y;
    }

    swap(): Point<T> {
        return new Point(this.y, this.x);
    }
}

export function run(): void {
    const p = new Point(0.0, 1.0).swap();
    console.log(`point ${p.x} ${p.y}`);
}
