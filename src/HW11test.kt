var myMap: HashMap<String, String>? = null
fun main(){
    val names: Array<String> = arrayOf("KG", "RU", "USA", "TR")

    val codes: Array<String> = arrayOf("+996", "+7", "+1", "+98")
    myMap = hashMapOf()

    codes.indices.forEach {

            myMap?.put(names[it], codes[it])
        }
        myMap?.forEach {
            println("key= ${it.key}, value= ${it.value}")
    }

}