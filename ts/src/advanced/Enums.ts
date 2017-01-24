class Some<T> {
    value: T;
    constructor(value: T) {
        this.value = value;
    }
}

class None {}

type Option<T> = Some<T> | None;

function run(): void {
    const option = new Some("string")
}

export { run, Option, Some, None };
