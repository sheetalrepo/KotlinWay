import java.util.TreeMap

/**
 * HashMap (MutableMap)
 * HM is mutable collection which provides both read am write functionalities.
 *
 * Maps
 * This interface is immutable, fixed size and its methods support read only access.

 */

fun main(args: Array<String>) {
    hashMapEg()
    treeMapEg()
    mutableMapOfEg()
    mapOfEg()
}


fun hashMapEg() {
    var maps = HashMap<String, String>()
    maps["ccc"] = "Cat"
    maps["bb"] = "Zoy"
    maps.put("a", "Apple")

    for ((name, word) in maps)
        println("$name : $word")

    println("\n=========== ProdBug ==========")
}

fun treeMapEg() {
    var maps = TreeMap<String, Int>()
    maps.put("a", 10)
    maps["ccc"] = 30
    maps["bb"] = 20

    for ((k, v) in maps)
        println("$k : $v")

    for(key in maps.keys){
        println("Element at key $key = ${maps[key]}")
    }
println("\n=========== ProdBug ==========")
}


//mutable
fun mutableMapOfEg() {
    val myMap = mutableMapOf(1 to "Jan", 2 to "Feb", 3 to "Mar")
    myMap[4]="Apr"

    for ((k, v) in myMap)
        println("$k : $v")

    println("\n=========== ProdBug ==========")
}


//immutable
fun mapOfEg() {
    val myMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")

    for ((k, v) in myMap)
        println("$k : $v")

    println("\n=========== ProdBug ==========")
}

