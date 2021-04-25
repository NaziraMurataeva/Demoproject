fun main(){
    println("введите четырехзначное число")
    val ch = readLine()!!.toInt()
    val chastlivoe : Boolean
    if(ch % 10 + ch / 10 % 10 == ch / 100 % 10 + ch / 1000 ) {
        chastlivoe = true
    } else {
        chastlivoe = false
    }
    println(chastlivoe)

}