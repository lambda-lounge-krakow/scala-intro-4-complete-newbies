# Playing with String interpolation

Since Scala 2.10 we can interpolate Strings, that is, change parts of the String using external value. Why so late, some would ask, because Martin was against it. :-)
See old thread on [why Martin hates String interpolation](http://www.scala-lang.org/old/node/2025).

In Java it's not possible to interpolate anything in a String, though you may format a String using any of those 3:

`System.out.format("The '%s' method died at line %d at '%s'.", methodName, lineNumber, currentTime);
String.format(...);
System.out.printf(...);
`
Feel free to try them out in REPL if you don't know them.

Rubyists know String interpolation like so:
`val out = "#{name} is #{age} years old"`
where name and age either are defined prior or at runtime an error is thrown.

## Interpolators
There are three different interpolators and you can add your own.
Interpolators are documented in **SIP-11**, that is Scala Improvement Proposal #11, which led to their introduction to Scala language.

Behind the scenes interpolators are expanded to `StringContext("interpolated string here").interpolatorNameHere(values to be inserted into String here)`.

## s interpolator

1. Create a variable name. Make it your name. 
2. Use `s` string interpolator as it was used in slides, to make it display a greeting for name you used. 
3. Reassign variable to new name (your loved one, or mine, or someones mother)
4. Did the previously interpolated value changed?
5. Now try display how much is some arithmetic operation, using `s` interpolator.
6. What if you interpolate a string with a value that does not exist?
7. And if you interpolate in a multiline String?
8. And if a single-line String you have control characters, like `\n` or `\t`?
9. Can you have nested interpolation?

Now try simple formatting, display current date in long and short format or how much is Π, with 2 and 4 decimal places

## f interpolator

Simple formatting ain't possible with SIMPLE interpolator, but it is possible with FORMATTING interpolator.
This interpolator was created as an equivalent of C `printf` methods, or Java `String.format()` and others.

You may want to refresh on `printf` formatters (my thanks to Alvin Alexander for this list):

    %c  character
    %d  decimal (integer) number (base 10)
    %e  exponential floating-point number
    %f  floating-point number
    %i  integer (base 10)
    %o  octal number (base 8)
    %s  a string of characters
    %u  unsigned decimal (integer) number
    %x  number in hexadecimal (base 16)
    %%  print a percent sign
    \%  print a percent sign

## raw interpolator

Take a look again at String with control characters you created earlier. Interpolator `s` interpreted them. What if you DIDN'T want that?
That's where the raw interpolator comes in.

Try same String but precede it with `raw` instead of `s`.

## Sources

[Official docs](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
[SIP-11](http://docs.scala-lang.org/sips/completed/string-interpolation.html)


## Advanced usage:

* Since you know the API, try interpolating strings without shorthand notation.
* Write your own interpolator! For logs and for JSON.
* Take a look at [JsonQuote library](https://github.com/maffoo/jsonquote), note how interpolation is used there.
* Take a look at how this was done PRIOR to Scala2.10: http://speaking-my-language.blogspot.com/2009/12/string-interpolation-in-scala.html and try implementing some examples here
