/**
 * Constructors:
 *  1. Primary - Passing Value, Default Value
 *  2. Secondary - in next chapter
 *
 *  Constructor keyword is optional
 */

//class ConstructorsExample constructor(var n : String) {
//class ConstructorsExample(var n: String) {
class ConstructorsExample constructor(var n: String = "Default Value") {
    var name: String = n

    fun printMe() {
        println("Kotlin Const Eg: $name")
    }
}


fun main(args: Array<String>) {
    //var obj = ConstructorsExample("Lotus")  // Primary Constructor Eg
    var obj = ConstructorsExample()   // Primary Constructor with Default Value

    obj.printMe()
    println("=========== ProdBug ==========")
}