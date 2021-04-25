
fun main() {
    println("add number of month")
    val month = readLine()!!.toInt()
    val days: String

    days = when (month) {
        2 -> "29 0r 28 days"
        4, 6, 9, 11 -> "30 days"
        1, 3, 5, 7, 8, 10, 12 -> "31 days"
        else -> "only 12 month"
    }

    println(days)
}