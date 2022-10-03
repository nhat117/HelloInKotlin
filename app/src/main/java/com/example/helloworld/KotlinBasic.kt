package com.example.helloworld

fun main() {
    var denis = Person("Dennis","Hang",31)
        denis.age = 32
        denis.firstName
        println("Dennis is ${denis.age}")
        denis.hobby = "Skateboard"
        denis.stateHobby()
    input(4)


}

//Data class sample
data class User(val id: Long, var FirstName)

class Person(firstName: String, lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch netflĩx"
    var firstName: String? = null
    get() {
        return  this.lastName.lowercase()
    }
    lateinit var lastName: String //This is to avoid to having initialize right away
    //Member constructor
    constructor(firstName: String,lastName: String,age: Int): this(firstName, lastName){
        this.age = age
    }
    init {
        this.firstName = firstName
        this.lastName = lastName
    }

    //Methods
    fun stateHobby() {
        println("${this.firstName} hobby is ${this.hobby}")
    }
}

fun basicFunction() {
    print("Tommy")
}

fun input(a: Int) {
    //Shadowing concept
    var a = a
    a = 5
    println(a)
}

