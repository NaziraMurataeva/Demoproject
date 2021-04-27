fun main(){
val person = Person( "Asan", "Usen",30)
    println(person.name)
    println(person.surname)
    println(person.age)
 //println(person.address)

   person.introduceYourself()

  val employee = Employee( "Elon", "Musk", 50, 35)
  employee.introduceYourself()

}

open class Person(val name: String, val surname: String, val age: Int) {
    //    var name: String = "John"
//    var surname: String = "Doe"
//    var age: Int = 27
//
// init {
//      this.name = name
//       this.surname = surname
//      this.age = age
//   }
//  var address: String? = null
//  constructor(name: String, surname: String, age: Int, address:String): this(name, surname, age){
//     this.address = address
//   }
  open fun introduceYourself() {
        println(" my name is $name. I love programming")
   }
}


class Employee(name: String, surname: String, age: Int, val experience: Int): Person(name,surname,age) {

    override fun introduceYourself() {
        println("my name is $name $surname, i have $experience years of experience")
    }
}


