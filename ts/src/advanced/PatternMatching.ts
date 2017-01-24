import * as Enums from './Enums'

export function run(): void {
    const option = new Enums.Some("string");
    if (option instanceof Enums.Some) {
        console.log(`got value: ${option.value}`);
    } else if (option instanceof Enums.None) {
        console.log("got none");
    }
}
