# Hello World 
(dans pleins de langage de programmation) 


## En Python 
```
print("Hello World !")
```

## En R
```
print("Hello World !")
```

## En C
```
#include <printf.h>

int main () {
    printf("Hello World !");
}
```

## En C++
```
#include <printf.h>

int main () {
    printf("Hello World !");
}
```

## En C#
```
Console.WriteLine("Hello, World!");
```

## En HTML
```
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>
</head>
<body>
    <p>Hello world</p>
</body>
</html>
```

## En Java
```
public Class Hello
{
public static void main(String[] args)
{
  System.out.println("Hello World !");
}
}
```
## En PHP
```
<?php

echo "Hello world!\n";
```

## En Ruby
```
puts "Hello world!"
```

## En TypeScript
```
const message:string = "Hello world!";
console.log(message);
```

## En Fortran
```
program main
    print *, "Hello world!"
end program main
```

## En Lua
```
print 'hello world!'
```

## En Erlang
```
main(_) -> io:format("Hello world!").
```

## En Clojure
```
(println "Hello world!")
```

## En D
```
import std.stdio;
void main()
{
    writeln("Hello world!");
}
```

## En Perl
```
print 'Hello world !';
```

## En Kotlin
```
fun main() {
    println("Hello world!")
}
```

## En Swift
```
print("Hello world!")
```

## En Rust
```
fn main() {
    println!("Hello world!")
}
```

## En Assembly
```
section .data
    msg db "Hello world!", 0ah

section .text
    global _start

_start:
    mov rax, 1
    mov rdi, 1
    mov rsi, msg
    mov rdx, 13
    syscall
    mov rax, 60
    mov rdi, 0
    syscall
```
