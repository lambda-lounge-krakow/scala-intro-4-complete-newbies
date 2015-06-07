# How to run Scala code

Other than REPL, as this was done during workshops.

**Goal: write a piece of code that prints "Ave Tomek!"**

## Interpret the code

* Create a file
* Put code in that file
* Save the file, quit editing
* Run `scala filename.fileextension`, usually `SomeName.scala`
* Enjoy results.

## With main method

Traditional way:

* Create a file
* Within it, create an object

    object Name {
      // here goes body
    }

* Within that object, define a method `main`, with following signature:

    def main(args: Array[String]): Unit

* Write `main` method's body
* Save the file, quit editing
* Compile the code: `scalac FileName.FileExtension`, usually `scalac SomeName.scala`
* Run it: `scala ObjectName`
* Enjoy results.

## Briefest way, via App

* Create a file
* Within it, create an object, that `extends App`
* Just type your code in object's body
* Save the file, quit editing
* Compile the code
* Run it
* Enjoy results.


# Bonus exercise
To compare traditional way with `main` method and Scala way with extending `App` type, let's use `javap` tool (but not one from REPL, the JDK one).
Just to inform you: 

```
    javap command disassembles one or more class files. Its output depends on the options used. If no options
    are used, javap prints out the package, protected, and public fields and methods of the classes passed to  it.
    javap prints its output to stdout.
```

So, let's run it: `javap *.class` and see for ourselves how large is the difference between code with `main` method and code extending `App` type.
