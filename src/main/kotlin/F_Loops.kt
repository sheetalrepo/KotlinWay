/**
 * IfElse, IfElse Expression
 * Switch (When)
 */

fun main(args: Array<String>) {
//    loopIfElse()
//    loopElseIf()
//    switchWhen()
    switchWhen2()
//    forLoopExample()
//    forEachLoop()
}


fun loopIfElse() {
    var a: Int = 20;
    var b: Int = 10;

    //Normal Way
    if (a > b) {
        println("If loop ...")
    } else {
        println("Else loop ...")
    }

    //Expression out of IfElse
    var bigNumber = if (a > b) {
        a
    } else {
        b
    }
    println("Bigger number is $bigNumber")
    println("=========== ProdBug ==========")
}


fun loopElseIf() {
    var a: Int = 20;
    var b: Int = 10;

    if (a > b) {
        println("If loop ...")
    } else if (b > a) {
        println("Else If loop ...")
    } else {
        println("Both are equal")
    }
    println("=========== ProdBug ==========")

}


/**
 * Adv : No need to use break stmt
 *
 */
fun switchWhen() {

    //Normal Way
    val num: Int = 3;
    when (num) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Default case")
    }
    println("=========== ProdBug ==========")

    //When expression
    val numExp: Int = 4;
    var output = when (numExp) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> println("Default case")
    }

    println("Switch When Expression: $output")
    println("=========== ProdBug ==========")
}


fun switchWhen2() {
    val str: String = "jan";

    when (str) {
        "jan" -> {
            println("Jan Month")
            println("Jan Month")
        }
        "feb" -> println("Feb Month")
        "mar" -> println("Mar Month")
        else -> println("Default case")
    }
    println("=========== ProdBug ==========")
}


/**
 *   a..b
 *   b downTo a
 *   reversed
 *   until
 *   downTo
 */
fun forLoopExample() {
    println("\n=========== ProdBug ==========")
    //Normal For Loop
    var nums = 2..10
    for (n in nums)
        println(n)

    println("\n=========== ProdBug ==========")

    //Until will not include last number
    var nums50 = 50 until 60
    for (n in nums50)
        println(n)

    println("\n=========== ProdBug ==========")

    //For loop in Step of 2
    var nums90 = 90..100
    for (n in nums90 step 2)
        println("Step of 2 = $n")

    println("\n=========== ProdBug ==========")

    //For loop in Reverse Order
    var rev = 20 downTo 16
    for (n in rev)
        println("Rev = $n")

    println("\n=========== ProdBug ==========")

    //For loop in Reverse Order Style 2
    var numsRev = 30..40
    for (n in numsRev.reversed())
        println("Rev = $n")

    println("\n=========== ProdBug ==========")


    //For loop chars
    var char = 'A'..'Z'
    for (ch in char)
        println("Chars = $ch")

    println("\n=========== ProdBug ==========")
}



fun forEachLoop(){
    //var numList = 10..15
    var numList = listOf<Int>(10, 11, 12, 13, 14, 15)

    numList.forEach { println(it) }
    numList.forEach { x -> print("$x ") }
}