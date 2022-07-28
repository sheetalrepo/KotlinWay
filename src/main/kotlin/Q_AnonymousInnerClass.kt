/**
 *  Anonymous Class
 *
 *
 *  obj:Interface = object:Interface{//code}
 *
 */

interface Playable2 {
    fun play()
}

fun main() {
    println("\n=========== ProdBug ==========")

    var obj: Playable2 = object : Playable2 {
        override fun play() {
            println("Lets play Basketball")
        }
    }

    println(obj.play())

}

