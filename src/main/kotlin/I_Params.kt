@file:JvmName("MyParams")

import java.util.TreeMap

/**
 * Params
 *
 * @file annotation will be used in J_CallingJavaToKotlin class
 */

fun main(args: Array<String>) {

    //Passing Params
    var sum = passingParams(10, 20)
    println("Sum = $sum")
    println("\n=========== ProdBug ==========")

    var result = passingParams2(20, 20)
    println("Result = $result")
    println("\n=========== ProdBug ==========")

    var max = findMaxNumber(50, 60)
    println("Max = $max")
    println("\n=========== ProdBug ==========")

    var default1 = passingDefaultParams(20)
    var default2 = passingDefaultParams(20, 200)
    println("Default 1 = $default1")
    println("Default 2 = $default2")
    println("\n=========== ProdBug ==========")

    namedParams(20, 12345)
    namedParams(age = 30, phoneNo = 123456)
    namedParams(phoneNo = 1234567, age = 40)
    println("\n=========== ProdBug ==========")

    namedDefaultParams(23, "Dec", "2030")
    namedDefaultParams(23, "Nov")
    namedDefaultParams(23, year = "2050")
    namedDefaultParams(23)

    println("\n=========== ProdBug ==========")


}

/**
 * Passing Params and Returning Sum
 */
fun passingParams(a: Int, b: Int): Int {
    var c = a + b;
    return c
}

/**
 * Expression in One line
 */
fun passingParams2(n: Int, m: Int): Int = n + m


/**
 * Expression in One line
 */
fun findMaxNumber(n: Int, m: Int): Int = if (n > m) n else m


/**
 * Default Param
 */
fun passingDefaultParams(a: Int, b: Int = 100): Int {
    var c = a + b;
    return c
}


/**
 * Named Param
 */
fun namedParams(age: Int, phoneNo: Int) {
    println("Age is $age and phoneNo is $phoneNo")
}

/**
 * Named Default Param
 */
fun namedDefaultParams(day: Int, month: String = "Jan", year: String = "2022") {
    println("Day is $day & Month is $month & Year is $year")
}