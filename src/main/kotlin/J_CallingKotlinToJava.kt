/**
 * Calling code from Kotlin to Java
 *
 */

fun main(args: Array<String>) {
    callKotlin2Java()
}


/**
 * pom.xml > properties > maven.compiler.source = 11
 * java 1.5 not supported
 */
fun callKotlin2Java() {
    //Create Object of Java Class
    var javaObj = C_JavaPojo2();

    //Calling Setters implicitly
    javaObj.abc = "Hey Guys.... I am Java";

    //Calling Getters implicitly
    println("Accessing Java Object: " + javaObj.abc)

    //Java Style
    javaObj.setAbc("Java Way only")
    println("Accessing Java Object: " + javaObj.getAbc())

    println("\n=========== ProdBug ==========")
}