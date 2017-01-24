namespace Deeply {
    export namespace Nested {
        export function foo() {
            console.log("called `deeply::nested::foo()`");
        }
    }
}

export function run(): void {
    Deeply.Nested.foo();
}
