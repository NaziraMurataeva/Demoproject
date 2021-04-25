fun main(){
    println("введите возраст")
    val age = readLine()!!.toInt()
    if( age > 1 && age < 200) {
        if (age == 11 || age == 12 || age == 13 || age == 14) { println("$age лет")
        } else if(age % 10 == 1) { println("$age год")
        } else if(age % 10 == 2) { println("$age года")
        } else if (age % 10 == 3) { println("$age года")
        } else if (age % 10 == 4) { println("$age года")
        } else println("$age лет")
    } else println("это не может быть возраст человека")

}


