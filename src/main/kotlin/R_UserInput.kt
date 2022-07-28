import java.util.Scanner

/**
 * In Java:
 * We use Scanner to take input from user
 *
 * 'in' is a reserved keyword in Kotlin
 * and hence we need to use escape character called Backtick
 *
 * readLine() is using BufferedReader
 */

fun main() {
    println("\n=========== ProdBug ==========")


    //Style 1
    println("\nEnter any number: ")
    var sc = Scanner(System.`in`)
    var num = sc.nextInt()
    println("User input 1: $num")

    //Style 2 : Better option , can read int, str
    println("\nEnter any String: ")
    var input = readLine()
    println("User input 2: $input")
}

