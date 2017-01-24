class Circle {
    x: number;
    y: number;
    radius: number;

    constructor(x: number, y: number, radius: number) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    area(): number {
        return Math.PI * (this.radius * this.radius);
    }
}

export function run(): void {
    const c = new Circle(0.0, 0.0, 2.0);
    console.log(`circle ${c.x} ${c.y} ${c.radius}`);
}
