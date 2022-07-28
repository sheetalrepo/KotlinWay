/**
 * Equals, ==
 * EqualsIgnoreCase
 * null values
 */

fun main(args: Array<String>) {
    compareTwoStrings()
    compareTwoStrings2()
    compareTwoStringsIgnoreCase()
    nullValueHandling()
}

/**
 * Warning on using Equals
 *
 */
fun compareTwoStrings() {
    println("=========== ProdBug ==========")
    var str1: String = "Hello";
    var str2: String = "Hello";

    if (str1.equals(str2))
        println("Strings are Equals")
    else
        println("Strings are Not Equals")


    println("\n=========== ProdBug ==========")
}

fun compareTwoStrings2() {
    var str1: String = "Hello";
    var str2: String = "Hello";

    if (str1 == str2)
        println("Strings are ==")
    else
        println("Strings are Not ==")

    println("\n=========== ProdBug ==========")
}


/**
 * No Warning in case we use EqualsIgnoreCase
 */
fun compareTwoStringsIgnoreCase() {
    var str1: String = "Hello";
    var str2: String = "hello";

    if (str1.equals(str2, true))
        println("Strings are EqualsIgnoreCase")
    else
        println("Strings are Not EqualsIgnoreCase")

    println("\n=========== ProdBug ==========")
}

/**
 * By Default Kotlin don't allow null value to String
 *
 * It avoids all unnecessary NPE
 */
fun nullValueHandling() {
    //var str1 : String = null  //Compiler Error
    var str1: String? = null
    var str2: String = "Apple"

    //println("Length of String is: "+ str1.length)  //Compiler Error
    println("Length of String is: " + str1?.length)
    println("Length of String is: " + str2.length)

    println("\n=========== ProdBug ==========")
}