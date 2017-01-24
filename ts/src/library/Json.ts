interface Point {
    x: number;
    y: number;
}

export function run(): void {
    let point: Point = { x: 1.0, y: 2.0};
    let serialized = JSON.stringify(point);
    console.log(`serialized = ${serialized}`);
    let deserialized = JSON.parse(serialized) as Point;
    console.log(`deserialized = Point(${deserialized.x}, ${deserialized.y})`);
}

