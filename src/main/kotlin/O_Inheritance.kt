/**
 * Inheritance:
 * By default kotlin class and methods are Final
 *          i.e. cannot be sub classed or override
 *
 * open : With open we can make it non-final
 *
 */
open class BaseClass {
    fun engine() {
        println("I am Basic Engine")
    }

    open fun fuel() {
        println("Petrol Engine Only")
    }
}

class Car : BaseClass() {
    fun carEngine() {
        println("I am Car Engine")
    }

    override fun fuel() {
        println("Diesel Engine")
    }
}

//args are not mandatory
//fun main(args: Array<String>) {
fun main() {
    //Child reference, Child Obj
    var carObj = Car()
    carObj.engine()  // Calling Parent's method
    carObj.fuel()    // Overridden Method
    carObj.carEngine()  // Child Method
    println("=========== ProdBug ==========")

    //Parent reference, Child Obj
    var carObj2: BaseClass = Car()
    carObj2.engine()
    carObj2.fuel()
    //carObj2.carEngine()  // With Parent ref, we can't call Child Methods

    println("=========== ProdBug ==========")
}