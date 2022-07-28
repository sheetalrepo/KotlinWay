/**
 * Interface
 */
interface Apple {
    fun eatApple()
    fun sweetness() {
        println("Apple is sweet")
    }

    fun newMethodAdded() {
        println("Defined Method, will not break existing code")
    }
}

interface Mango {
    fun eatMango()
    fun sweetness() {
        println("Mango is more sweet")
    }
}

class TestClass : Apple, Mango {
    override fun eatApple() {
        println("I am eating Apple")
    }

    override fun eatMango() {
        println("I am eating Mango")
    }

    //all three line will work
    override fun sweetness() {
        println("To remove Ambiguity: Overriding both interface method and calling own implementations")
        //super<Apple>.sweetness()
        //super<Mango>.sweetness()
    }
}

//Note: main func is outside class
fun main() {
    var obj = TestClass()
    obj.eatApple()
    obj.eatMango()
    obj.newMethodAdded()
    println("=========== ProdBug ==========")


    obj.sweetness()
    println("=========== ProdBug ==========")
}