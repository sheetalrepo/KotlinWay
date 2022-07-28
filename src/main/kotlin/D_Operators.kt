/**
 * Operators, String Template
 */

fun main(args: Array<String>) {
    howToSum()
}


/**
 *  Sum + , Diff - , Mult *, Div /
 */
fun howToSum() {
    var a: Int = 20;
    var b: Int = 10;
    var sum = a + b;
    println("Sum:" + sum)  //Warning to convert into template
    println("Sum: $sum")
    println("Sum of $a and $b is $sum")  // String Template println("\n=========== ProdBug ==========")
}