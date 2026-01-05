# tour-de-lang

## Overview

tour-de-lang is a point-by-point comparison between 6 modern programming languages. It focuses on core language features as well as a number of standard library aspects for the following languages:

- Python
- TypeScript
- Go
- Rust
- Kotlin
- Dart

## TOC

- Language Basics
  - Variables
  - Control Flow
  - Basic Types
  - Functions
  - Classes
  - Modules
- Language Advanced
  - Closures
  - Generics
  - Enums
  - Pattern Matching
  - Traits
- Library
  - Arrays
  - Collections
  - Futures
  - Json
  - Strings
  - Tuples

## Language Basics

### Variables

- Python

```python
x = 5
y: int = 5
z = 5
```

- TypeScript

```typescript
const x = 5;
const y: number = 5;
let z = 5;
```

- Go

```go
const x = 5
var y int = 5
z := 5
```

- Rust

```rust
let x = 5;
let y: i32 = 5;
let mut z = 5;
```

- Kotlin

```kotlin
val x = 5
val y: Int = 5
var z = 5
```

- Dart

```dart
final x = 5;
final int y = 5;
var z = 5;
```

### Control Flow

- Python

```python
max_val = a if a > b else b

for item in collection:
  # ...
  pass

while not done:
  # ...
  pass
```

- TypeScript

```typescript
let max: number;
if (a > b) {
  max = a;
} else {
  max = b;
}

for (const item of collection) {
  // ...
}

while (!done) {
  // ...
}
```

- Go

```go
max := a
if b > a {
  max = b
}

for _, item := range collection {
  // ...
}

for !done {
  // ...
}
```

- Rust

```rust
let max = if a > b { a } else { b };

for item in collection {
  // ...
}

while !done {
  // ...
}
```

- Kotlin

```kotlin
val max = if (a > b) a else b

for (item in collection) {
  // ...
}

while (!done) {
  // ...
}
```

- Dart

```dart
final max = a > b ? a : b;

for (var item in collection) {
  // ...
}

while (!done) {
  // ...
}
```

### Basic Types

- Python

  int, float, bool, str, bytes, None

- TypeScript

  number, boolean, string, void, bigint

- Go

  int, int8, int16, int32, int64, uint, uint8, uint16, uint32, uint64, uintptr, float32, float64, complex64, complex128, bool, string, rune, byte

- Rust

  i8, i16, i32, i64, u8, u16, u32, u64, isize, usize, f32, f64, bool, char, ()

- Kotlin

  Byte, Short, Int, Long, Float, Double, Boolean, Char, Unit

- Dart

  num, int, double, bool, String, void

### Functions

- Python

```python
def sum(a: int, b: int) -> int:
  return a + b
```

- TypeScript

```typescript
function sum(a: number, b: number): number {
  return a + b;
}
```

- Go

```go
func sum(a, b int) int {
  return a + b
}
```

- Rust

```rust
fn sum(a: i32, b: i32) -> i32 {
  a + b
}
```

- Kotlin

```kotlin
fun sum(a: Int, b: Int): Int {
  return a + b
}
```

- Dart

```dart
int sum(int a, int b) {
  return a + b;
}
```

### Classes

- Python

```python
import math
from dataclasses import dataclass

@dataclass
class Circle:
  x: float
  y: float
  radius: float

  def area(self) -> float:
    return math.pi * (self.radius * self.radius)

  @classmethod
  def create(cls) -> "Circle":
    return cls(0.0, 0.0, 2.0)
```

- TypeScript

```typescript
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
```

- Go

```go
import "math"

type Circle struct {
  X      float64
  Y      float64
  Radius float64
}

func NewCircle(x, y, radius float64) Circle {
  return Circle{X: x, Y: y, Radius: radius}
}

func (c Circle) Area() float64 {
  return math.Pi * (c.Radius * c.Radius)
}
```

- Rust

```rust
struct Circle {
  x: f64,
  y: f64,
  radius: f64,
}

impl Circle {
  fn new(x: f64, y: f64, radius: f64) -> Circle {
    Circle { x, y, radius }
  }

  fn area(&self) -> f64 {
    std::f64::consts::PI * (self.radius * self.radius)
  }
}
```

- Kotlin

```kotlin
class Circle(val x: Double, val y: Double, val radius: Double) {
  fun area(): Double {
    return Math.PI * (radius * radius)
  }

  companion object {
    fun create(): Circle = Circle(0.0, 0.0, 2.0)
  }
}
```

- Dart

```dart
import 'dart:math' as math;

class Circle {
  const Circle(this.x, this.y, this.radius);

  final double x;
  final double y;
  final double radius;

  double area() {
    return math.pi * (radius * radius);
  }
}
```

### Modules

- Python

```python
# modules.py
from deeply.nested.utils import foo as bar

def run() -> None:
  bar()

# deeply/nested/utils.py
def foo() -> None:
  print("called deeply.nested.utils.foo()")
```

- TypeScript

```typescript
// modules.ts
import { foo as bar } from "./deeply/nested/utils";

export function run(): void {
  bar();
}

// deeply/nested/utils.ts
export function foo(): void {
  console.log("called deeply.nested.utils.foo()");
}
```

- Go

```go
// modules.go
package modules

import "example.com/project/deeply/nested"

func Run() {
  nested.Foo()
}

// deeply/nested/utils.go
package nested

import "fmt"

func Foo() {
  fmt.Println("called `deeply::nested::foo()`")
}
```

- Rust

```rust
use self::deeply::nested::foo as bar;

pub fn run() {
  bar();
}

mod deeply {
  pub mod nested {
    pub fn foo() {
      println!("called `deeply::nested::foo()`");
    }
  }
}
```

- Kotlin

```kotlin
// Modules.kt
package io.digitalstream.modules

import io.digitalstream.deeply.nested.foo as bar

fun run() {
  bar()
}

// deeply/nested/Utils.kt
package io.digitalstream.deeply.nested

fun foo() {
  println("called io.digitalstream.deeply.nested.foo()")
}
```

- Dart

```dart
// modules.dart
import 'deeply/nested/utils.dart' as nested;

void run() {
  nested.foo();
}

// deeply/nested/utils.dart
void foo() {
  print("called deeply.nested.utils.foo()");
}
```

## Language Advanced

### Closures

- Python

```python
num = 5
plus_num = lambda x: x + num
```

- TypeScript

```typescript
const num = 5;
const plus_num = (x: number) => x + num;
```

- Go

```go
num := 5
plusNum := func(x int) int {
  return x + num
}
```

- Rust

```rust
let num = 5;
let plus_num = |x: i32| x + num;
```

- Kotlin

```kotlin
val num = 5
val plusNum = { x: Int -> x + num }
```

- Dart

```dart
final n = 5;
final plusNum = (int x) => x + n;
```

### Generics

- Python

```python
from dataclasses import dataclass
from typing import Generic, TypeVar, Union

T = TypeVar("T")

@dataclass
class Point(Generic[T]):
  x: T
  y: T

  def swap(self) -> "Point[T]":
    return Point(self.y, self.x)
```

- TypeScript

```typescript
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
```

- Go

```go
type Point[T any] struct {
  X T
  Y T
}

func (p Point[T]) Swap() Point[T] {
  return Point[T]{X: p.Y, Y: p.X}
}
```

- Rust

```rust
struct Point<T: Clone> {
  x: T,
  y: T,
}

impl<T: Clone> Point<T> {
  fn swap(&self) -> Point<T> {
    Point { x: self.y.clone(), y: self.x.clone() }
  }
}
```

- Kotlin

```kotlin
class Point<T>(val x: T, val y: T) {
  fun swap(): Point<T> {
    return Point(y, x)
  }
}
```

- Dart

```dart
class Point<T> {
  final T x;
  final T y;

  const Point(this.x, this.y);

  Point<T> swap() {
    return Point(y, x);
  }
}
```

### Enums

- Python

```python
from dataclasses import dataclass
from typing import Generic, TypeVar, Union

T = TypeVar("T")

@dataclass(frozen=True)
class Some(Generic[T]):
  value: T

@dataclass(frozen=True)
class Nothing(Generic[T]):
  pass

Option = Union[Some[T], Nothing[T]]
```

- TypeScript

```typescript
export type Some<T> = { kind: "some"; value: T };
export type None = { kind: "none" };
export type Option<T> = Some<T> | None;

export const Option = {
  some<T>(value: T): Some<T> {
    return { kind: "some", value };
  },

  none(): None {
    return { kind: "none" };
  },

  isSome<T>(opt: Option<T>): opt is Some<T> {
    return opt.kind === "some";
  },

  isNone<T>(opt: Option<T>): opt is None {
    return opt.kind === "none";
  },
};
```

- Go

```go
type Option[T any] struct {
  value T
  ok    bool
}

func Some[T any](v T) Option[T] {
  return Option[T]{value: v, ok: true}
}

func None[T any]() Option[T] {
  var zero T
  return Option[T]{value: zero, ok: false}
}

func (o Option[T]) IsSome() bool { return o.ok }
func (o Option[T]) IsNone() bool { return !o.ok }
func (o Option[T]) Value() T     { return o.value }
```

- Rust

```rust
enum Option<T> {
  Some(T),
  None,
}
```

- Kotlin

```kotlin
sealed class Option<out T> {
  data class Some<out T>(val value: T) : Option<T>()
  object None : Option<Nothing>()
}

fun <T> some(value: T): Option<T> = Option.Some(value)
fun <T> none(): Option<T> = Option.None

inline fun <T, R> Option<T>.map(f: (T) -> R): Option<R> =
  when (this) {
    is Option.Some -> Option.Some(f(value))
    is Option.None -> Option.None
  }
```

- Dart

```dart
sealed class Option<T> {
  const Option();
}

final class Some<T> extends Option<T> {
  final T value;
  const Some(this.value);
}

final class None<T> extends Option<T> {
  const None();
}

// Helpers
Option<T> some<T>(T value) => Some(value);
Option<T> none<T>() => const None();
```

### Pattern Matching

- Python

```python
from dataclasses import dataclass
from typing import Generic, TypeVar, Union

T = TypeVar("T")

@dataclass(frozen=True)
class Some(Generic[T]):
  value: T

@dataclass(frozen=True)
class Nothing(Generic[T]):
  pass

Option = Union[Some[T], Nothing[T]]

option: Option[str] = Some("string")

match option:
  case Some(value=value):
    print(f"got value: {value}")
  case Nothing():
    print("got none")
```

- TypeScript

```typescript
const option: Option<string> = Option.some("string");

if (Option.isSome(option)) {
  console.log(`got value: ${option.value}`);
} else {
  console.log("got none");
}
```

- Go

```go
option := Some("string")

if option.IsSome() {
  fmt.Printf("got value: %s\n", option.Value())
} else {
  fmt.Println("got none")
}
```

- Rust

```rust
let option = Some("string");
match option {
  Some(value) => println!("got value: {}", value),
  None => println!("got none"),
}
```

- Kotlin

```kotlin
val option: Option<String> = Option.Some("string")
when (option) {
  is Option.Some -> println("got value: ${option.value}")
  is Option.None -> println("got none")
}
```

- Dart

```dart
final Option<String> option = Some("string");

switch (option) {
  case Some(value: final value):
    print("got value: $value");
  case None():
    print("got none");
}
```

### Traits

- Python

```python
from typing import Protocol

class Similarity(Protocol):
  def is_similar(self, x: object) -> bool:
    ...

  def is_not_similar(self, x: object) -> bool:
    return not self.is_similar(x)
```

- TypeScript

```typescript
interface Similarity {
  isSimilar(x: unknown): boolean;
  isNotSimilar(x: unknown): boolean;
}

abstract class BaseSimilarity implements Similarity {
  abstract isSimilar(x: unknown): boolean;
  isNotSimilar(x: unknown): boolean {
    return !this.isSimilar(x);
  }
}
```

- Go

```go
type Similarity interface {
  IsSimilar(x any) bool
}

func IsNotSimilar(s Similarity, x any) bool {
  return !s.IsSimilar(x)
}
```

- Rust

```rust
use std::any::Any;

trait Similarity {
  fn is_similar(&self, x: &dyn Any) -> bool;
  fn is_not_similar(&self, x: &dyn Any) -> bool {
    !self.is_similar(x)
  }
}
```

- Kotlin

```kotlin
interface Similarity {
  fun isSimilar(x: Any): Boolean
  fun isNotSimilar(x: Any): Boolean = !isSimilar(x)
}
```

- Dart

```dart
abstract class Similarity {
  bool isSimilar(Object x);
  bool isNotSimilar(Object x) => !isSimilar(x);
}
```

## Library

### Arrays

- Python

```python
xs = [1, 2, 3]
ys = [0] * 20
x = xs[0]
length = len(xs)
```

- TypeScript

```typescript
const xs = [1, 2, 3];
const x = xs[0];
const length = xs.length;
```

- Go

```go
xs := []int{1, 2, 3}
ys := make([]int, 20)
x := xs[0]
length := len(xs)
```

- Rust

```rust
let xs = [1, 2, 3];
let ys = [0; 20];
let x = xs[0];
let length = xs.len();
```

- Kotlin

```kotlin
val xs = arrayOf(1, 2, 3)
val ys = Array(20) { 0 }
val x = xs[0]
val length = xs.size
```

- Dart

```dart
final xs = [1, 2, 3];
final ys = List<int>.filled(20, 0);
final x = xs[0];
final length = xs.length;
```

### Collections

- Python

```python
result = [it.upper() for it in names if it.startswith("a")]
for item in result:
  print(item)
```

- TypeScript

```typescript
names
  .filter((it) => it.startsWith("a"))
  .map((it) => it.toUpperCase())
  .forEach(console.log);
```

- Go

```go
for _, name := range names {
  if strings.HasPrefix(name, "a") {
    fmt.Println(strings.ToUpper(name))
  }
}
```

- Rust

```rust
for item in names
  .iter()
  .filter(|it| it.starts_with('a'))
  .map(|it| it.to_uppercase())
{
  println!("{item}");
}
```

- Kotlin

```kotlin
names
  .filter { it.startsWith("a") }
  .map(String::uppercase)
  .forEach(::println)
```

- Dart

```dart
names
  .where((it) => it.startsWith('a'))
  .map((it) => it.toUpperCase())
  .forEach(print);
```

### Futures

- Python

```python
import asyncio

async def compute() -> str:
  return "string"

async def main() -> None:
  try:
    res = await compute()
    print(f"promise succeeded {len(res)}")
  except Exception as ex:
    print(f"promise failed {ex}")

asyncio.run(main())
```

- TypeScript

```typescript
async function compute(): Promise<string> {
  return "string";
}

async function main(): Promise<void> {
  try {
    const res = await compute();
    console.log(`promise succeeded ${res.length}`);
  } catch (reason) {
    console.log(`promise failed ${reason}`);
  }
}

main();
```

- Go

```go
type result struct {
  value int
  err   error
}

promise := make(chan result, 1)

go func() {
  promise <- result{value: len("string"), err: nil}
}()

res := <-promise
if res.err != nil {
  fmt.Printf("promise failed %v\n", res.err)
} else {
  fmt.Printf("promise succeeded %d\n", res.value)
}
```

- Rust

```rust
use futures::executor::block_on;

let res: Result<usize, u32> = block_on(async {
  let value: Result<String, u32> = Ok("string".to_string());
  value.map(|s| s.len())
});

match res {
  Ok(len) => println!("promise succeeded {}", len),
  Err(ex) => println!("promise failed {}", ex),
}
```

- Kotlin

```kotlin
import kotlinx.coroutines.runBlocking

suspend fun compute(): String = "string"

fun main() = runBlocking {
  try {
    val res = compute()
    println("promise succeeded ${res.length}")
  } catch (ex: Exception) {
    println("promise failed $ex")
  }
}
```

- Dart

```dart
Future<String> compute() async {
  return "string";
}

Future<void> main() async {
  try {
    final res = await compute();
    print("promise succeeded ${res.length}");
  } catch (ex) {
    print("promise failed $ex");
  }
}
```

### Json

- Python

```python
import json
from dataclasses import asdict, dataclass

@dataclass
class Point:
  x: float
  y: float

point = Point(1.0, 2.0)
serialized = json.dumps(asdict(point))
print(f"serialized = {serialized}")
deserialized = Point(**json.loads(serialized))
print(f"deserialized = {deserialized}")
```

- TypeScript

```typescript
interface Point {
  x: number;
  y: number;
}

const point: Point = { x: 1.0, y: 2.0 };
const serialized = JSON.stringify(point);
console.log(`serialized = ${serialized}`);
const deserialized = JSON.parse(serialized) as Point;
console.log(`deserialized = Point(${deserialized.x}, ${deserialized.y})`);
```

- Go

```go
import (
  "encoding/json"
  "fmt"
)

type Point struct {
  X float64 `json:"x"`
  Y float64 `json:"y"`
}

point := Point{X: 1.0, Y: 2.0}
serialized, _ := json.Marshal(point)
fmt.Printf("serialized = %s\n", serialized)
var deserialized Point
_ = json.Unmarshal(serialized, &deserialized)
fmt.Printf("deserialized = %+v\n", deserialized)
```

- Rust

```rust
use serde::{Deserialize, Serialize};

#[derive(Serialize, Deserialize, Debug)]
struct Point {
  x: f32,
  y: f32,
}

let point = Point { x: 1.0, y: 2.0 };
let serialized = serde_json::to_string(&point).unwrap();
println!("serialized = {}", serialized);
let deserialized: Point = serde_json::from_str(&serialized).unwrap();
println!("deserialized = {:?}", deserialized);
```

- Kotlin

```kotlin
import com.google.gson.Gson

data class Point(val x: Float, val y: Float)

val gson = Gson()
val point = Point(1.0f, 2.0f)
val serialized = gson.toJson(point)
println("serialized = $serialized")
val deserialized = gson.fromJson(serialized, Point::class.java)
println("deserialized = $deserialized")
```

- Dart

```dart
import 'dart:convert';

class Point {
  const Point(this.x, this.y);

  final double x;
  final double y;

  factory Point.fromJson(Map<String, dynamic> json) {
    return Point(
      json['x'] as double,
      json['y'] as double,
    );
  }

  Map<String, dynamic> toJson() => {
        'x': x,
        'y': y,
      };
}

void main() {
  final point = Point(1.0, 2.0);
  final serialized = json.encode(point.toJson());
  print("serialized = $serialized");
  final deserialized = Point.fromJson(json.decode(serialized));
  print("deserialized = $deserialized");
}
```

### Strings

- Python

```python
hello = "Hello "
world = "world!"
hello_world = hello + world
print(hello_world)
```

- TypeScript

```typescript
const hello = "Hello ";
const world = "world!";
const helloWorld = hello + world;
console.log(helloWorld);
```

- Go

```go
import "fmt"

hello := "Hello "
world := "world!"
helloWorld := hello + world
fmt.Println(helloWorld)
```

- Rust

```rust
let hello = "Hello ".to_string();
let world = "world!".to_string();
let hello_world = hello + &world;
println!("{}", hello_world);
```

- Kotlin

```kotlin
val hello = "Hello "
val world = "world!"
val helloWorld = hello + world
println(helloWorld)
```

- Dart

```dart
final hello = "Hello ";
final world = "world!";
final helloWorld = hello + world;
print(helloWorld);
```

### Tuples

- Python

```python
tuple_ = (1, "hello")
tuple2: tuple[int, str] = (1, "hello")
print(f"tuple {tuple_[0]}, {tuple_[1]}")
```

- TypeScript

```typescript
let tuple = [1, "hello"];
let tuple2: [number, string] = [1, "hello"];
console.log(`tuple ${tuple[0]}, ${tuple[1]}`);
```

- Go

```go
import "fmt"

tuple := struct {
  First  int
  Second string
}{First: 1, Second: "hello"}

fmt.Printf("tuple %d, %s\n", tuple.First, tuple.Second)
```

- Rust

```rust
let tuple = (1, "hello");
let tuple2: (i32, &str) = (1, "hello");
println!("tuple {}, {}", tuple.0, tuple.1);
```

- Kotlin

```kotlin
val tuple = Pair(1, "hello")
val tuple2: Pair<Int, String> = Pair(1, "hello")
println("tuple ${tuple.first}, ${tuple.second}")
```

- Dart (Dart 3 records)

```dart
final tuple = (1, "hello");
final (first, second) = tuple;
print("tuple $first, $second");
```

## Reference

### Python

- https://docs.python.org/3/tutorial/

### Go

- https://go.dev/tour/

### Dart

- https://dart.dev/guides/language/language-tour

### Kotlin

- https://kotlinlang.org/docs/reference/basic-types.html

### Rust Book

- https://doc.rust-lang.org/book/

### TypeScript

- https://www.typescriptlang.org/docs/handbook/intro.html
