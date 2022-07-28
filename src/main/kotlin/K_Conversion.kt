/**
 * Int to Double
 */

fun main(args: Array<String>) {
    var finalAmt = convertingDoubleToInt(100, 0.10)
    println(finalAmt)
    println("\n=========== ProdBug ==========")

    stringToInt("10")
}

/**
 * Double to Int
 * toInt()
 */
fun convertingDoubleToInt(amt: Int, interest: Double): Int {
    return (amt + (amt * interest)).toInt();
}

/**
 * toInt()
 */
fun stringToInt(amtStr: String) {
    //Java Style
    var m = Integer.parseInt(amtStr)
    m += 2
    println("Java: String to Int: $m")

    //Kotlin
    var n = amtStr.toInt();
    n++
    println("Kotlin: String to Int: $n")
    println("\n=========== ProdBug ==========")
}


