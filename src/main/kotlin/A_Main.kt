/**
 *  Main method/function
 *  Semicolon is Redundant in Kotlin
 *  No need to create class to run functions
 *  Kotlin Object Creation
 */


fun main(args: Array<String>) {
    println("Hello World!");
    gettingUsedToKotlin()
}


/**
 * Creating Object
 * Access Variables and Constants
 *
 */
fun gettingUsedToKotlin() {
    //Create Object of Kotlin Class
    var obj = B_KotlineClass();

    //Print - 2 types
    //Accessing Constant and Variables
    println("Name variable: " + obj.name)

    println("Name variable: ${obj.name}")
    println("Name variable: ${obj.name}")


    println("Constant: " + obj.TEN)
    println("\n=========== ProdBug ==========")

}

