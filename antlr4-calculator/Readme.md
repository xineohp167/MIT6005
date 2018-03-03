Getting started
===============

1. Install ANTLR v4 ([manual](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation))
1. Generate ANTLR files `antlr4 Calculator.g4 -no-listener -visitor -o app`
1. Copy visitor implementation `cp *.java app`
1. Compile `javac app/*.java`

Run
===

Type in console `cd app && java Run`

```
a = 1+2
b = a^2
c = a + b * (a - 1)
a + b + c
```

Result should be equal 33.0
