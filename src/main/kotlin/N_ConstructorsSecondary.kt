/**
 * Constructors:
 *  1. Primary - Passing Value, Default Value
 *  2. Secondary
 *
 *  constructor keyword is not mandatory
 */


class ConstructorsSecondary constructor(var n: String) {
//class ConstructorsSecondary(var n : String) {
    var name: String = n
    var age: Int = 0

    //Rule: Secondary must call primary const via this()
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    fun printMe() {
        println("Kotlin Sec Const Eg: $name  $age")
    }
}


fun main(args: Array<String>) {
    var obj1 = ConstructorsSecondary("Lotus")
    obj1.printMe()

    var obj2 = ConstructorsSecondary("Rose", 30)
    obj2.printMe()

    println("=========== ProdBug ==========")
}