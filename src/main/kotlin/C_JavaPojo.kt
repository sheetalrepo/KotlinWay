import kotlin.jvm.JvmStatic

/**
 * Hey I am a Java Class
 *
 *
 * target > classes : complied .class files for both Java and Kotlin classes
 */
class C_JavaPojo {
    var abc: String? = null

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val obj = C_JavaPojo()
            obj.abc = "I am Kotlin Class"
            println(">>>>>" + obj.abc)
        }
    }
}