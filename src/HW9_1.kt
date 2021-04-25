fun main() {
   for ( i in 0 until 4) {
       for (j in 0 until 4) {
           print("* ")
       }
      println("* ")
   }
println("-----------------------------")
    var num = 0
    for ( i in 0 until 4 ) {
        for (j in 0..i) {
            print(" * ")
            ++num
        }

        println("")
    }
}

