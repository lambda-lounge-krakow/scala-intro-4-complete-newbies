# About

Introductory workshop for those interested in Scala, but knowing nothing (or very little) of it.

Originally led by @LAFK_pl in a series of three identical meetups:
* [A](http://www.meetup.com/Lambda-Lounge-Krakow/events/222286731/)
* [B](http://www.meetup.com/Lambda-Lounge-Krakow/events/222286776/)
* [C](http://www.meetup.com/Lambda-Lounge-Krakow/events/222286818/)

Attempts to offer basic blocks and show Scala capabilities from both FP and OOP side to both sides mixed.
Contained in 2 hours, so it could be attended after work.

## Extra - exercises
During workshops few topics gained more attention than others. I made couple of promises that I'm following up on with extra exercises. Each exercise is self-contained within it's directory, there is exercise text and code. I encourage to go through them in order (1, 2, 3...) and to use git tags I've set up to see my solutions only after you've attempted your own.

Exercises so far:

* running Scala code (besides REPL) - tag: _Exercise1_
* multiline Strings and stripMargin - tag: _Exercise2_
* String interpolation - tag: _Exercise3_


TBA:

* access modifiers
* delayedInit
* type linearization
* partial application
* currying
* OOP + FP
* collections

# Prerequisites

Install `scala` from [scala-lang.org](http://scala-lang.org) by downloading archived file, extracting it to your disk and finally adding it's bin dir to your path.

Version acceptable for most examples is 2.9 even, best would be 2.10 or 2.11.

# Technicalities
Since the workshop is purely CLI one, almost completely REPL-reliant, my slides are in Vim and everything was shown in the terminal (emulator).

## Workshop slides
are in Markdown - [ScalaWorkshop.md](https://github.com/lambda-lounge-krakow/scala-intro-4-complete-newbies/blob/master/ScalaWorkshop.md) - and can be seen with any text editor. If you would like to see them as slides, you'll need:
* Vim
* [Presenting.vim](https://github.com/sotte/presenting.vim) plugin by Sotte

Then just type `:StartPresenting` and you're set. `n` - next slide, `p` - previous, `q` - quit.
If folds are annoying you / are closed when you present, type `zn` to open them all.

## Terminal's 'resolution'
was set to Monospace font size 22, black on white.

The only slide that didn't fit and required manual re-sizing to default terminal settings has tech slide prior to it.
The default settings I had then for terminal are Monospace 12, white on black.

# Thanks and feedback
While my sources list spilled to numerous slides to thank all those, who helped me with this workshop creation, I still made errors - and I claim all to be mine and mine only (preciousss!). 

I'm grateful for all feedback and corrections: open an issue or request to pull your correction.
