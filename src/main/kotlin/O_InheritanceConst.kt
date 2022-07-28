/**
 * Base class constructor will be called by default
 */
open class BaseClassNew(hno: Int) {
    init {
        println("Base House No is $hno")
    }
}

//class CarNew(hno: Int) : BaseClassNew(50) {
class CarNew(hno: Int) : BaseClassNew(hno) {
    init {
        println("Child House No is $hno")
    }
}


fun main() {
    //Child reference, Child Obj
    var obj = CarNew(30)

    println("=========== ProdBug ==========")

}