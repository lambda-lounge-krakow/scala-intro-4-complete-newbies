# Today

I want YOU to 
* know basic building blocks in Scala.
* write code in it.

# Install

Distro-dependant:

    sudo apt-get install scala

May be outdated. It gets us REPL though.

## Activator

Typesafe promoted platform for Scala starters
* Ask me for pendrive with it
* Or get 400MB reasonably fast: http://www.typesafe.com/get-started

## SBT

    curl -s https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt > ~/bin/sbt \
      && chmod 0755 ~/bin/sbt

## Why Scala?

* Blub Paradox, by Paul Graham
* Awe, by Konrad Malawski
* Approval, by José Romero
* Reactions of people who made the switch

# A random quote

      I was convinced that mixing FP with OOP will have great practical value. I was upset by both 
      contempt functional programmers had towards object-oriented programmers and views expressed 
      by object-oriented programmers that functional programming place was academia. So I wanted 
      to prove that these two paradigms could be linked and that such combination could bring us 
      something new and powerful. I also wanted to create a language in which I could feel 
      comfortable, when programming.
            -- Martin Odersky, asked "why he created Scala" by Bruce A. Tate, translation: my own

# Core concepts:

* Mixes FP and OO
  * Thus functions are first-class citizens
  * Objects and classes and methods are as in OO
* Runs in JVM, compiles to bytecode
* Statically typed with nice type inference
* Uses mixins known as Traits

# Tomek Borek

* works @ Symentis
* leads 
      λ lounge KRK
* can be reached:

      ___          _  ___                   
     / _ )    )   /_) )_ )_/     _   )      
    ( (_(    (__ / / (  /  )    )_) (       
     \___/                  __ (            
      ___                                   
     / _ ) _   _ _   _  o  )    _  _   _ _  
    ( (_( (_( ) ) ) (_( ( (  o (_ (_) ) ) ) 
     \___/  _)                              

has a blog: lafkblogs.wordpress.com


## Tomek Borek (cont.)

* helps with 

       ___                     ___     ___    _  _   
      / __|    ___     ___    / __|   / _ \  | \| |  
     | (_ |   / -_)   / -_)  | (__   | (_) | | .` |  
      \___|   \___|   \___|   \___|   \___/  |_|\_|  
    _|"""""|_|"""""|_|"""""|_|"""""|_|"""""|_|"""""| 
    "`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'


        ___             _       _             _                    _   _   _    ___   
       | _ \   ___     | |     (_)     ___   | |_       o O O   _ | | | | | |  / __|  
       |  _/  / _ \    | |     | |    (_-<   | ' \     o       | || | | |_| | | (_ |  
      _|_|_   \___/   _|_|_   _|_|_   /__/_  |_||_|   TS__[O]  _\__/   \___/   \___|  
    _| """ |_|"""""|_|"""""|_|"""""|_|"""""|_|"""""| {======|_|"""""|_|"""""|_|"""""| 
    "`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'./o--000'"`-0-0-'"`-0-0-'"`-0-0-'



     ________  ________  ___  __    ________  ___  __       
    |\   ____\|\   ____\|\  \|\  \ |\   __  \|\  \|\  \     
    \ \  \___|\ \  \___|\ \  \/  /|\ \  \|\  \ \  \/  /|_   
     \ \_____  \ \  \    \ \   ___  \ \   _  _\ \   ___  \  
      \|____|\  \ \  \____\ \  \\ \  \ \  \\  \\ \  \\ \  \ 
        ____\_\  \ \_______\ \__\\ \__\ \__\\ _\\ \__\\ \__\
       |\_________\|_______|\|__| \|__|\|__|\|__|\|__| \|__|
       \|_________|


## Tomek and Scala?

* learning Scala as I go, so NOT an expert
* 2-weeks time, just evenings, will do

# Learning path I once took

    [SFI 2013] TDD drogą do oświecenia w Scali - Konrad Malawski, Tomasz Borek



# REPL

* Read
* Evaluate - in Scala they like to say evaluate over returns
* Print
* Loop

    scala

# The inevitable

    scala> println ("Witaj hybrydowy świecie!")
    Witaj hybrydowy świecie!

    // Hello hybrid world is ok too
    // Polish ain't required for Scala (yet) ;-)

# Now we may quit

    :q
    :quit

# Start REPL again

What it says?

# Compiling

* REPL reads -> evaluates == compiles
* scalac compiler compiles to Java bytecode
* for how see sources at the end
* JDK6 = Scala 2.10, 2.11,
* JDK8 = 2.12, half a year at least

# 

      REPL HANDLING


## Basic REPL handling

All commands are inputted with a colon and in lowercase, like `:so`

* Help
* Verbosity
* Shortcuts
* History

## FYI:

* Nice checks
  * Types
  * Implicits
  * javap [-v]
* More serious compiling
  * cp - classpath
  * imports
  * load
  * **paste**
  * replay
  * sh - shell

# 

      EXCERCISES


# Basic Scala inside REPL

* Do simple arithmetic
 * Add two integers: 1+1, 7+5
* Type conversion
 * Add int to double: 1+1.1
 * Vice versa

# Strings!
* "@LAFK_pl".size
* "".size
* "@"+"LAFK"+"_"+"pl"
* """Strings are sad
     Trompet
     is victorious"""
* and try that with `stripMargins`!

   """|Strings are sad
      |Trompet
      |is victorious""".stripMargin

* More on Strings? java.lang will gladly oblige.

    val what = "awesome"; println(s"string interpolation is ${what.toUpperCase}!")
      -- since 2.10.0

# Time for type conversion

* What will the type be here?
 * 5. + (4.*(3)) 
 * 5. + ((4).*(3))



# Expression

* Those REPL lines you used have been expressions. 
* `1+1`
* `if (x>2) then 5 else 2.5`
* Expression can be assigned to a value.


# Val vs Var

Your thoughts?

# Val VS Var

Constant   vs  Var
Immutable  vs  Variable

    val five = 5 // now try reassigning that to 10
    five = 10
    var five = 5 // and again
    five = 10
    five = 10.

* Note: you can reassign vals in REPL 

Constant in Scala ain't like C++ const. See _const correctness_ for differences.

# Conditionals

* 5 < 6
* 5 >= 2


# Now tell me something about REPL answers.

What is `res12`?


# Lazy slide

# Exceptions

    throw new Exception("omg epic fail")

# Lazy eval

Compare:

    val willItThrow = throw new Exception("hmmm")

With:

    lazy val shallIThrow = throw new Exception("ah!")

And finally, with:

    def aThrow = throw new Exception("ohhh!")


# FP

What can you do with functions?

    def addOne(m: Int): Int = m + 1

* Parameter types are required.
* `def` - define
* Default modifier is public (unseen)
* Type inference via `:`

Modifiers - later.

## Parens can be ommitted

    def a() = "a"

    def n = "n"

* only for 0-arity function
* if omitted when defined, don't add when called - error happens

## For one-liners

so can curly braces, like {}

## Function literals
 
    val fun = (a: String) => a // function literal

## Anonymous functions

    (x: Int) => x + 1 // anonymous function

    val xPlus1 = (x: Int) => x + 1 // anon function for initializing value is OK!

## Function composition

Let's define some functions:

    scala> def f(s: String) = "f(" + s + ")"
    f: (String)java.lang.String

    scala> def g(s: String) = "g(" + s + ")"
    g: (String)java.lang.String

### `compose`

    val fComposeG = f _ compose g _
    fComposeG("test")

### `andThen`

    val fAndThenG = f _ andThen g _
    fAndThenG("miracle")

## You may have heard of underscore...

It actually may mean different things, but in `{ _ + 2 }` would mean unnamed parameter.

## Partial application

Let's have a simple adder:

    def adder(m: Int, n: Int) = m + n

And now let's partially apply it:

    val add2 = adder(2, _:Int)

## Curried functions

Let's have a multiplicator that will take two arguments, when I choose to give them:

    scala> def multiply(m: Int)(n: Int): Int = m * n
    multiply: (m: Int)(n: Int)Int

Now at different call sites I may provide `m` and `n`:

    val doubling = multiply(2) _

# OOP 

    scala> class Calculator {
         |   val brand: String = "HP"
         |   def add(m: Int, n: Int): Int = m + n
         | }
    defined class Calculator

    scala> val calc = new Calculator
    calc: Calculator = Calculator@e75a11

    scala> calc.add(1, 2)
    res1: Int = 3

    scala> calc.brand
    res2: String = "HP"


## Constructor

    class Calculator(brand: String) {
      /**
       * A constructor.
       */
      val color: String = if (brand == "TI") {
        "blue"
      } else if (brand == "HP") {
        "black"
      } else {
        "white"
      }

      // An instance method.
      def add(m: Int, n: Int): Int = m + n
    }


## Case class and companion objects

    case class Person(name: String)

    object Person {
      def from(s: String) = new Person(name)
    }

    :javap Person


## Main loop?

* Yes, you can. 
* Additionally, you can:

    object Hello extends App {
      println ("Hello World!")
    }

# Types

    def fun(a: String) = a // inference
    def fun(a: String): String = 12 // static

## Traits

Or how to do diamond in Scala:

    trait Car {
      val brand: String
    }

    trait Shiny {
      val shineRefraction: Int
    }

    class BMW extends Car with Shiny {
      val brand = "BMW"
      val shineRefraction = 12
    }

    trait Brakes {
      val canBrake: Boolean
    }

    class BMW extends Car with Brakes {
      val brand = "BMW"
      val canBrake = true
    }

Traits are awesome implementation of mixins concept IMO.

# OOP + FP

Couple of niceties, since OOP methods are often greatly similar to functions, you can:
* def isScalaDev(a: Human): Boolean = ???
* List(...).filter(h => isScalaDev(h))
* List(...).filter(isScalaDev _)
* List(...).filter(isScalaDev)
* val fun = isScalaDev _
* List(...).filter(fun)

# Adjustment time!

Tech slide... adjust font to smaller. ;-P

# More? 

|              +++++++                    '                                                                                                                :::::::::::::::::::::::::::::::::::::::::::
|              @@@@@@@.                   '                         +,             '                                           `.               @          :::::::::::::::::::::::::::::::::::::::::::
|              @@@@@@@#                   '    +:      #            +,          # `@            `#        :@@#              .+ ;+               @          ::::`:`::::::::` ,,,.:.` ::,`,:::::::::::::
|              ;@@@@@@@                   '    +:      #            +,          #               `#        :#;;              .+                  @          ::::,`:. .:. ,:. ,.: ,:`..:,`,:  ::::::::::
|              `@@@@##@                   '    +:,:;' #@@`',  #.  .@+,.+ #. ,# #@@ #  +;  #.#   @@+  #.   :'  +, @ '`+:  ;# @@','  #. ,:;'  +#  @          ::::: ,: .:.`::`.:,.``: .::,:`,,.::::::::::
|               @@@:'@+.                  '    +:,@@@ #@@`#@`@@@` @@@,.+ #.`@@+#@@ # #@@: @@@,  @@# @@@   :'  +, @ '@@@ '@@,@@#,' @@@ ,@@@ ;@@# @          ::::: :. ...`::. .,., :`:.:,: :  ::::::::::
|               @@@;'@#+                  '    +:,# #` # `@``@ ,+:+ +,.+ #.#,   #  # @ `# @ ;;  `# `# :'  :@@.+, @ '+ @ @   .+ ,'`# :',# #`   @ @          :::::::::::::::::::::::::::::::::::::::::::
|               '@@@@@@@                  '    +:,+ #` # `# .+  #', +,.+ #.#    #  # #  @ # :;  `# ,' `#  :#;.+, @ ', @ @   .+ ,',' `#,+ #` @@@ @          :::::::::::::::::::::::::::::::::::::::::::
|               `@@@@@@#                  '    +:,+ #` # `# .# `#': +,.+ #.#`   #  # #  @ # :;  `# ,+ `#  :'  +, @ ', @ @   .+ ,',+ `#,+ #`#, @ @          :::::::::::::::::::::::::::::::::::::::::::
|                @@@@@+@.                 '    +:,+ #` @ `#  @ +':@ @,.# @.+# ; @  # @ ,# # :;  `# `@ +;  :'  +;`@ ', @ #: ,.# ,'`@ +;,+ #`@ `@ @          :::::::::::::::::::::::::::::::::::::::::::
|                @@@@@@@+                 '    +:,+ #` @@`#  #@@  @@', @@+. @@# @@ # '@@  # :;   @# #@@   :'  ,@@@ ', @ .@@; @#,' #@@ ,+ #`#@@@ @          ::::````````````````````````````````````:::
|                ;@@@@@@@                 '                                                                                                                ::::````````````````````````````````````:::
|                .@;@@@#@                 '                                                                                                                ::::`````````````,```:',:```````````````:::
|                 @@@@@@@`                '                                                                                                                ::::`````````````````,,,`,``````````````:::
|                 @@@@@@@'                '                                                                                                                ::::`````````````;``,`,::.'`````````````:::
|                 +@@@@@@@                '         @    @      @   #,             :.      +;                                                              ::::````````````````````````````````````:::
|                  #@@@@@@                '    @@@@#@    @      @   +,             @   #@   @                                                              ::::````````````````````````````````````:::
|                 , '@@@@@`               '      @  @           @                 #;   @@   +;                                                             :::::::::::::::::::::::::::::::::::::::::::
|                 # ;@@@@@'               '      @  @,@: @ #.@' @ #,+,.;@@  @@;.  @    @@`  `#                                                             :::::::::::::::::::::::::::::::::::::::::::
|                 @ ;@@@@@@               '      @  @@'# @ #@;@ @`@ +,.@'@`+,.#`  @   ,';'   @                                                             :::::::::::::::::::::::::::::::::::::::::::
|                `@ ,@@@@@@               '      @  @  # @ #  @ @#. +,.# #.#  #   @   +.`#   @                                                             :::::::::::::::::::::::::::::::::::::::::::
|                '@;,@@@@@@`              '      @  @  # @ #  @ @@  +,.# #.''''   @   @@@@   @                                                             ```````````````````````````````````````````
|                @@+,@@@@@@;              '      @  @  # @ #  @ @;# +,.# #. @#    @   @@@@` `#                                                                                                        
|                @@@@@@@@@@@              '      @  @  # @ #  @ @ @ +,.# #.,@,    #. .#  +' +;                                                                                                        
|               `@@@@@@@@@@@              '      @  @  # @ #  @ @ '++,.# #.:@@@   `@ +,  .# @                                                                                                         
|               ;@@@@@@@@@@@`             '                                @  #`   #.      '.                                                                                                         
|               @@@@@@@@@@@@;             '                                @,`@
|               @@@'@@@@@@  `             '                                 ##                                                                                                                        
|               @@@@@@@@@@'@'             '                                   
|              :@@@@@@@@@@@@`             '                                   Meetup A: http://www.meetup.com/Lambda-Lounge-Krakow/events/222770938/
|              @@@@@@@@@@@@@ ,            '
|              @@@#@@@+@@@@@@@            '
|              @@@''@@.@@@+ ;@            '
|             ,@@@;@@@ @@@@@@@            '
|             #@#@'#@# @@@@@@@,           '
|             @@,@@@@, @@@@+@@#           '
|             @@.@@@@  '@@@@@@@           '
|            .@@+@@@@  `@@@@@@@           '                                   
|            +@@;@@@@   @@@@@@@,          '                                   
|            @@@+#@@'   @@@@@@@#          '   
|            @@@;#@@`   #@@@@@@@          '
|           .@@@#@@@    ,@@@@@@@          '
|           +@@@.@@@     @@@@@@@,         '
|           @@@@#+@+     @@@@@@@#         '
|           @@@@:#@.     @@@@@@@@         '
|          `@@@@+@@      :@@@@@@@         '
|          '@@@@.@@       @@@@@@@.        '
|          @@@@@:@@       @@@@@@+#        '
|          @@@@@+@:       @@@@@@#@        '
|         `@@@@@@@        ;@@@@@@@        '
|         ;@@@@@#@        `@@@@+@@.       '
|         @@@@@@@@         @@@@@@@+       '
|         #@@@@@@,         @@@@@@@@       '
|         @@@@@@@.         '@@@@@@@       '
|        :'@@@@@@`         `@@@@@@@`      '
|        @'@@@@@#           @@@@@@@'      '
|        @+@@@@@'           @@@@@@@@      '
|        @@@@@@@`           +@@@@@@@      '
|       ,@@@@@@#            .@@@@@@@`     '
|                                         '



# Sources

For starters:
* http://www.scala-lang.org/documentation/getting-started.html
* Activator: http://www.typesafe.com/get-started
* Activator complete docs: http://www.typesafe.com/activator/docs
* SBT recommended by Typesafe folks: https://github.com/paulp/sbt-extras


## Lang sources

* Scala 2.11 SPEC as PDF: http://scala-lang.org/files/archive/spec/2.11/
* API: http://www.scala-lang.org/documentation/api.html
* Scala style guide on types: http://docs.scala-lang.org/style/types.html
* Guide to all kinds of symbols: http://docs.scala-lang.org/tutorials/FAQ/finding-symbols.html

http://docs.scala-lang.org/tutorials/FAQ/collections.html


http://twitter.github.io/scala_school/basics.html

http://stackoverflow.com/questions/15623498/handy-ways-to-show-linearization-of-a-class
http://jim-mcbeath.blogspot.com/2009/08/scala-class-linearization.html

## New lang things

* New pattern matcher: http://www.scala-lang.org/download/changelog.html#a_new_pattern_matcher
* String interpolation: http://docs.scala-lang.org/overviews/core/string-interpolation.html
* http://docs.scala-lang.org/overviews/core/value-classes.html


## Blogs, videos, etc.

* Konrad GitHub tutorial on Scala Types: http://ktoso.github.io/scala-types-of-types/
 * associated SlideShare: http://www.slideshare.net/ktoso/scala-types-of-types-lambda-days
* SFI talk in Polish about TDD as a road to enlightenment in Scala: https://vimeo.com/61981309
* Scala first tutorial: http://www.scala-lang.org/docu/files/ScalaTutorial.pdf 
* Konrad and Jerzy's Scala workshop from JDD: http://www.data.proidea.org.pl/jdd/8edycja/materialy/KM_JM_scala-workshop-2013-jdd.pdf
* Scala school: http://twitter.github.io/scala_school/pattern-matching-and-functional-composition.html
* Statements vs expressions:
  * http://boldradius.com/blog-post/VBbp8jIAADIAlv6D/expressions-vs-statements-in-scala
  * http://stackoverflow.com/questions/10022408/is-everything-a-function-or-expression-or-object-in-scala


## HOW the compilation goes

* Prior to 2.10 via in-house bytecode manipulation lib
* Afterwards via ASM4: http://lamp.epfl.ch/~magarcia/ScalaCompilerCornerReloaded/2012Q2/GenASM.pdf
* In phases: https://wiki.scala-lang.org/display/SIW/Overview+of+Compiler+Phases
* In phases with less text and more structure: http://lampwww.epfl.ch/~emir/bqbase/2005/02/11/scalaPhases.html
* Take a look at λ for example: http://blog.takipi.com/compiling-lambda-expressions-scala-vs-java-8/
* Or delve deep: https://github.com/scala/scala/blob/master/src/compiler/scala/tools/nsc/backend/jvm/GenASM.scala
* 2.12 changes the game! :-)

## Books

* Atomic Scala by Bruce Eckel (from GeeCON)
* 7 languages in 7 week, chapter on Scala, by Bruce A. Tate

## Fun part

* **Konrad Malawski** - inspired me to take a look @Scala and got me learn it's basics in 2 weeks
* TAAG - text to ascii generator: http://patorjk.com/software/taag/#p=display&f=3D-ASCII&t=SCKRK
* Picascii: http://picascii.com/
* Sotte, for Presenting.vim
* And Brian Moolenar for this very program you see this in


 
