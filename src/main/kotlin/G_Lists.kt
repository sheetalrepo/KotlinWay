/**
 * Lists
 * listOf : Basic list is read only i.e. cannot be modified
 * MutableList : Normal Java list where we can add elements
 *
 * Higher Order Function
 * forEach()
 */

fun main(args: Array<String>) {
    //listBasicEg()
    //listModified()
    listForEach()
}


fun listBasicEg() {
    println("\n=========== ProdBug ==========")
    var nums = listOf<Int>(11, 12, 13, 14, 15)
    //nums.add(1)   //Compiler error
    for (i in nums)
        println(i)

    println("\n=========== ProdBug ==========")

    var numsElement = listOf<Int>(10, 20, 30, 40)
    for ((index, i) in numsElement.withIndex())
        println("Index: $index ; Ele Val:$i")

    println("\n=========== ProdBug ==========")

}

//Mutable list
fun listModified() {
    println("\n=========== ProdBug ==========")
    var nums: MutableList<Int> = mutableListOf<Int>(11, 12, 13, 14)
    nums.add(9)
    nums.add(0,10)  //with index

    for (i in nums)
        println(i)
}


/**
 * for (int i : lsInt ) {}
 * https://www.w3schools.com/java/java_for_loop.asp
 */
fun listForEach(){
    println("\n=========== ProdBug ==========")
    var numList = listOf<Int>(10, 20, 30)
    var nums = 1..10

    numList.forEach {print(it)}
    println("  \n")
    numList.forEach { x -> println(x) }  //Java 8 style
    nums.forEach (::println)

}