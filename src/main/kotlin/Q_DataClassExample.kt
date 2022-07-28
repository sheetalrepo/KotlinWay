/**
 * Data Class (POJO)
 *  - Used to store some data, in other words it's a POJO class
 *  - Just like Lombok library, Kotline avoid writing boilerplate code
 *
 * Basic Requirement:
 * - The primary constructor must have at least one parameter.
 * - The class cannot be open, abstract, inner or sealed
 *
 * Features:
 * We get
 * 1. getters, setters, hashCode, equals, toString,
 * 2. copy() and componentN() destructing an object
 *
 */

data class DataClass(var age: Int, var name: String)
//{optional curly braces}

fun main() {
    println("\n=========== ProdBug ==========")
    var obj1 = DataClass(10, "Bob")
    var obj2 = DataClass(20, "Dan")

    //Getters
    println("Obj1 Name: ${obj1.name}")
    println("Obj1 Age: ${obj1.age}")

    //Setters
    obj2.name = "Denver"
    println("Obj2 :$obj2")

    //toString
    println("Obj1 :$obj1")

    println("\n=========== ProdBug ==========")

    //copy
    var obj3 = obj1.copy()
    if (obj1 == obj3)
        println("Obj1 and Obj3 are same")
    else
        println("Obj1 and Obj3 are NOT same")


    println("\n=========== ProdBug ==========")


    //Destructuring Objects
    //Fetching details out of objects
    val ag2 = obj1.component1()
    val nm2 = obj1.component2()
    println("Split the objects: $ag2")
    println("Split the objects: $nm2")

    //Another Way to understand
    val (ag1, nm1) = obj1
    println("Split the objects: $ag1")
    println("Split the objects: $nm1")

}