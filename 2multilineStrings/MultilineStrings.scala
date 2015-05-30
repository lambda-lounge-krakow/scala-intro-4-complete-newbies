val multilineWithout = 
"""Strings are sad
   Trompets 
   are victorious"""

   // that was created with tabs and spaces for formatting

val multilineWith =
"""Strings stripMargin
   Trompet 
   is heard wailing""".stripMargin

println(multilineWithout)
println(multilineWith)
