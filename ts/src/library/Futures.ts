export function run(): void {
    let promise = new Promise<string>((resolve, reject) => {
        resolve('string');
    });
    promise
        .then((res) => {
            return res.length;
        })
        .then((res) => {
            console.log(`promise succeeded ${res}`);
        })
        .catch((reason) => {
            console.log(`promise failed ${reason}`);
        });
}
