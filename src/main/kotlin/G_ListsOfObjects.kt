/**
 * Lists
 *
 */

data class Fruit(
    var name: String,
    var price: Int
)

fun main(args: Array<String>) {
    listOfObjects()
}


fun listOfObjects() {
    println("\n=========== ProdBug ==========")

    var obj1 = Fruit("apple", 10)
    var obj2 = Fruit("mango", 20)

    //All style works
    var lsFruits = listOf(obj1, obj2)
    //var lsFruits = listOf(obj1, Fruit("mango", 20))
    //var lsFruits = listOf<Fruit>(obj1, Fruit("Orange", 30))
    //var lsFruits: List<Fruit> = listOf(obj1, Fruit("mango", 20))

    for (obj in lsFruits)
        println(obj)

}
