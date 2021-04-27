import kotlin.math.pow
fun main (){
    println(getMax(10, 8))

    println(getMax(15, 8, 6))

    sayHelloKotlin("java" ,  3)
    printInts(1,7,9,4)

    println(percent(100, 10, 3))

}

fun getMax(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

fun getMax(num1: Int, num2: Int, num3: Int):Int {
    return when{
        num1 > num2 && num1 > num3 -> num1
        num2 > num1 && num2 > num3 -> num2
        else -> num3
    }
}

fun printInts(vararg ints: Int){
    for(i in ints) println(i)
}

fun sayHelloKotlin(name: String, reps: Int){
    var counter:Int = reps
    while ( counter> 0) {

        println("hello $name! How are you?")
        counter--
    }

}
 fun percent(initial:Int, perc: Int, year: Int): Double = initial*(1 + perc / 100.toDouble()).pow(year)


