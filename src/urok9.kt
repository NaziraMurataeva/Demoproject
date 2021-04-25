fun main() {

    val names: ArrayList<String> = arrayListOf("kotlin", "Java", "Dart")
    for (i in 0 until names.size) {
        println(names[i])
    }

    names.forEachIndexed { index, name ->
        println("$index $name")
    }
    for (i in 10 downTo 1 step (2)) {
        if (i == 6) break
        println(i)
    }
}
