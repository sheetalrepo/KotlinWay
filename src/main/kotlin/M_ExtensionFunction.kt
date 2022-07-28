/**
 * Extension Method/Function
 *  - Method can be created outside class/file
 *
 */
fun main(args: Array<String>) {

    //Object creation
    var obj1 = B_KotlineClass()

    //Call existing method printCity
    obj1.city = "Delhi"
    obj1.printCity()
    println("=========== ProdBug ==========")

    //Call Extension Function
    obj1.printName()
    obj1.name = "Mango"
    obj1.printName()
    println("=========== ProdBug ==========")

}


/**
 * ClassName.newMethodName()
 * Extension Method
 * Useful in case old class not to be touched
 */
fun B_KotlineClass.printName() {
    println("Name = $name")
}
