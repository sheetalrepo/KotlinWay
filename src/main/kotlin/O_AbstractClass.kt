/**
 * Abstract are meant to be overridden
 * At least one method need to be abstract
 *
 */
abstract class AbstractClass {
    abstract fun happy()

    fun printAbc() {
        println("I am not abstract method")
    }
}

class ChildClass : AbstractClass() {
    override fun happy() {
        println("Overridden :Child is Happy")
    }
}

fun main(args: Array<String>) {
    var obj = ChildClass()
    obj.happy()     // Overridden method
    obj.printAbc()  // Parent method
    println("=========== ProdBug ==========")
}