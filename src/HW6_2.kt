import kotlin.math.*
fun main() {
    println("введите точку x")
    val x = readLine()!!.toDouble()
    println("введите точку y")
    val y = readLine()!!.toDouble()
    println("введите радиус ")
    val r = readLine()!!.toDouble()
    val h = sqrt (x * x + y * y)
    when {
        h < r  -> println("Принадлежит кругу")
        h > r  -> println("Не принадлежит кругу")
    }
}

