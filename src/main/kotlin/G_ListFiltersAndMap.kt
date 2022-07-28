/**
 * Filter : Based on some conditions
 * Map : With Map we can change form
 *
 */

fun main(args: Array<String>) {
    filterEg()
}


fun filterEg() {
    println("\n=========== ProdBug ==========")
    var numList = listOf<Int>(10, 15, 20, 25, 30)

    //Style 1
    var evenNumList = numList.filter { it % 2 == 0 }
    evenNumList.forEach {println(it)}
    println("\n=========== ProdBug ==========")

    var doubleEven = evenNumList.map { it * 2 }
    doubleEven.forEach { println(it) }
    println("\n=========== ProdBug ==========")

    //Style 2
    var doubleEven2 = numList
        .filter { it % 2 == 0 }
        .map { it * 3 }
    doubleEven2.forEach { println(it) }
}
