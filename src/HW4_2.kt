fun main(){
    println("Щпределить время пути поезда")
    println("Начало пути ЧАС:")
    val h1 = readLine()!!.toInt()
    println("Начало пути МИНУТА:")
    var m1 = readLine()!!.toInt()
    println("конец пути ЧАС:")
    var h2 = readLine()!!.toInt()
    println("конец пути МИНУТА:")
    var m2 = readLine()!!.toInt()
    var v = h2 * 60 + m2 - h1 * 60 + m1
    println("время пути поезда = $v минут ")
}