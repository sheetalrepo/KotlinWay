/**
 * Companion Objects:
 * To make static method we need to use companion objects
 *
 * There is nothing like 'static' keyword in Kotlin, hence we need to use Companion keyword
 */

class Normal {

    fun abc() {
        println("Calling via object...")
    }

    companion object {
        var i : Int = 10
        fun xyz() {
            println("Method inside companion object...")
        }
    }
}

fun main() {
    println("\n=========== ProdBug ==========")

    //Calling method via object
    var obj = Normal()
    obj.abc()

    //Calling static methods : ClassName.methodName
    println("Access member via class name:  ${Normal.i}")
    Normal.xyz()

}

