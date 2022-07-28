/**
 * Infix Method/Function
 * - dot is not required while calling methods
 * - It must be member function or extension function
 * - Infix methods takes only one parameter
 * - Default param are not allowed in infix func
 * - Code look like english language e.g.    result isEqualTo 10
 *
 * Types:
 * 1. Standard library Infix (and, or)
 * 2. Custom defined Infix
 */


class InfixTestClass {

    /**
     * All these three method are Custom Defined Infix Function
     */
    infix fun testInfixMethod(str: String) {
        println("Infix Function = $str")
    }


    infix fun square(n : Int): Int{
        return n * n
    }

    //This method will find DataType
    infix fun getMydataType(x: Any):Any{
        var i = when(x){
            is String -> "String"
            is Int -> "Integer"
            is Double -> "Double"
            else -> "invalid"
        }
        return i
    }

}


fun main(args: Array<String>) {

    //Standard Library Infix Func Eg:
    var a = 10
    var b = 20
    var c = 30
    var res = (b > a) and (c > b)
    println("Example of Standard System Defined Infix Func: $res")
    println("=========== ProdBug ==========")


    //Following are all Custom Defined Infix Func
    var obj = InfixTestClass()
    obj testInfixMethod("I am Infix1")     //Not dot operator
    obj testInfixMethod "I am Infix2"      // No bracket
    println("=========== ProdBug ==========")


    var result = obj square 10
    println(result)
    println("=========== ProdBug ==========")


    var d1 = obj getMydataType 10
    var d2 = obj getMydataType 20.5
    var d3 = obj getMydataType "abc"
    println(d1)
    println(d2)
    println(d3)
    println("=========== ProdBug ==========")
}