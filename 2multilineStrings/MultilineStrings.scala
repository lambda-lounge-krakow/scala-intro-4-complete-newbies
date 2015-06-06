val multilineWithout = 
"""Strings are sad
   Trompets 
   are victorious"""

   // that was created with tabs and spaces for formatting

val multilineWith =
"""Strings stripMargin
   #Trompet 
   #is heard wailing""".stripMargin('#')

val multilineWithNoChar = 
"""Strings stripMargin
  |no extra character
  |is needed""".stripMargin


val multilineEscapedQuotes = """Multiline string
 'may' have single
 "OR" double quotes
 within, without escape characters""".stripMargin

println(multilineWithout)
println(multilineWith)
println(multilineWithNoChar)
println("Additionally...")
println(multilineEscapedQuotes)
