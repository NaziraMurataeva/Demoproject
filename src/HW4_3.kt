fun main() {
    println("введите первое число")
    var a = readLine()!!.toInt()
    println("введите второеое число")
    var b = readLine()!!.toInt()
    var c = a
    a = b
    b = c
    println("a = $a , b= $b")

}