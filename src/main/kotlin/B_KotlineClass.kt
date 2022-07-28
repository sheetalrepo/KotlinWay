/**
 *
 *  # var = variable
 *  var is like general variable and it's known as a mutable variable in kotlin
 *  and can be assigned multiple times.
 *  var are mutable(Read and Write)
 *
 *  # val = constant
 *  val is like Final variable and it's known as immutable in kotlin
 *  and can be initialized only single time.
 *  val are immutable(Read only)
 *
 *  # String
 *  In kotlin String cannot be null by default
 *  in case we need to initialize with null, '?' operator need to be used
 *  This way we saved lots of NPE
 *
 *  #Calling Methods
 *  var obj = ClassName()
 *  obj.methodName()
 *
 */
class B_KotlineClass {
    var name: String = "Apple"  // variable
    val TEN: String = "TEN"   // constant
    var city: String? = null  // null variable

//    fun testValVar() {
//        name = "Mango"
//        //TEN = "ELEVEN"  // cant be changed, its final constant
//        city = "Delhi"
//        println("$name   $TEN   $city")
//    }

    /**
     * For M_ExtensionFunction.kt
     */
    fun printCity() {
        println("City = $city")
    }
}

//fun main(args: Array<String>) {
//    var obj = B_KotlineClass()
//    //obj.testValVar()
//}