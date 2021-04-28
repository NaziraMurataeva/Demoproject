
data class Cats(
    var name: String,
    var age: Int,
    var breed: String,
    var weight: Double)

data class Food(var name: String,
                var weight: Int,
                var calories: Int,
                var taste: String)

data class Paper( var name: String,
                  var color:String,
                  var paperweights: Double)

data class Boiler( var count: Int,
                   var height: Int,
                   var width:Int,
                   var depth: Int)

data class Battery(var height: Int,
                   var weight: Double,
                   var voltage: Int,
                   var maker: String)

data class Liquid( var volume: Int,
                   var type: String,
                   var origin: String)

data class Cup( var material: String,
                var volume: Int,
                var color: String)

data class Box(var material: String,
               var volume: Int,
               var color: String,
               var height: Int,
               var width:Int)

data class Student(var name: String,
                    var surename: String,
                    var age: Int,
                    var speciality:String,
                    var group: String )

data class Company_member(var name: String,
                          var surename: String,
                          var age: Int,
                          var position:String )

fun main() {
    val cat1 = Cats("Barsik", 5, "manul", 10.00)
    val burger = Food("Cheesburger", 15, 500, "tasty")
    val paper = Paper("a4","white", 0.8)
    val boiler1 = Boiler(100,110, 70, 100 )
    val battery = Battery(7,16.0, 2900, "Xiomi")
    val water = Liquid(1,"liquid", "natural")
    val cup = Cup("porcelain", 200, "pink")
    val box1 = Box("plastic", 3, "white", 30, 30 )
    val box2 = Box("plastic", 3, "white", 30, 30 )

    val student = Student("Rose", "Dowson", 18, "programm engeneer", "pi-1-20")
    val player = Company_member("Julian", "Draxler",28, "Midfielder")
    val player2 = Company_member("Kevin", "DeBruine",29, "Midfielder")



    println(cat1.toString())
    println(burger.toString())
    println(paper.toString())
    println(boiler1.toString())
    println(battery.toString())
    println(water.toString())
    println(cup.toString())
    println(box1.toString())
    println(student.toString())
    println(player.toString())
    println(cat1.hashCode())
    println(burger.hashCode())
    println(paper.hashCode())
    println(boiler1.hashCode())
    println(battery.hashCode())
    println(water.hashCode())
    println(cup.hashCode())
    println(box1.hashCode())
    println(student.hashCode())
    println(player.hashCode())
    println(player == player2)
    println(box1 == box2)
}






