fun main(){
    println("vvedite a,b и c")
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()
    var D: Double
    D = b * b - 4 * a * c
    if (D>0) {
        var x1: Double
        var x2: Double
        x1 = (-b - Math.sqrt(D))/(2*a)
        x2 = (b - Math.sqrt(D))/(2*a)
        println( "корень x1 = $x1, корень x2 = $x2")
    } else if (D == 0.0){
        var x: Double
        x = (-b - Math.sqrt(D))/(2*a)
        println("корень x= $x")
    } else
        println("уравнение не имеет корней")
}
