//fun main(){
//    var x = 1
//    for( i in 1..20) {
//        x = x * 2
//        println(x)
//    }
//
//}
//
fun main(){
    println("vvedite chislo")
    var num = readLine()!!.toInt()
    var c = 0
    while (num != 0) {
        num /= 10
        ++c
    }
    println("число состоит из $c цифр ")
}