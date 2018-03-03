Getting started
===============

1. Install ANTLR v4 ([manual](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation))
1. Generate ANTLR files `antlr4 Calculator.g4 -no-listener -visitor`
1. Compile `javac *.java`

Run
===

Type in console `java Run`


For testing:
```
a = 1+2
b = a^2
c = a + b * (a - 1)
a + b + c
```

Result should be equal 33.0
