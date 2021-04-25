fun main() {
    val itemCosts = mapOf("хлеб" to 50.0, "молоко" to 40.0, "масло" to 0.0)
    val shopinglist = listOf("хлеб", "молоко", "масло")
    var totalcost = 0.0
    for (i in shopinglist) {
        val cost = itemCosts[i]
        if (cost != null) {

        totalcost += cost
    }
}
        println(totalcost)
}