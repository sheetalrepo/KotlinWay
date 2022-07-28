/**
 * try catch finally
 * try as an expression
 *
 */
fun main(args: Array<String>) {
    exceptionHandling()
    exceptionHandlingExpression()
}


/**
 * try catch finally
 */
fun exceptionHandling() {
    var str: String = "10A"
    var i: Int = 0

    try {
        i = str.toInt()
        println("Number = $i")
    } catch (e: NumberFormatException) {
        println("Catch Block... $e")
    } finally {
        println("Finally Block... ")
    }

    println("\n=========== ProdBug ==========")
}


/**
 * try as an Expression
 */
fun exceptionHandlingExpression() {
    var str: String = "10A"
    var i: Int = 0

    var output: Int = try {
        str.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    println("Try Catch Expression: $output")
    println("\n=========== ProdBug ==========")

}


