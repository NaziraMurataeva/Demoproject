class Cat( var name: String, var age: Int, var breed: String){

    var satiety = 50
        set(value) {
        if (thirst > 45) {
            field -= value
        } else {
            field += value
        }

    }
    var thirst = 40
        set(value) {
            if (satiety > 50) {
                field -= value
            } else {
                field += value
            }
        }
    override fun toString(): String {
        return "Имя: $name\nВозраст:$age\nПорода:$breed\nУровень сытости:$satiety\nУровень жажды:$thirst"
    }


}
fun main(){
    val first = Cat("Murzik", 5, "meinkun")
     first.satiety = 40
     first.thirst = 50
    println(first.toString())

}
