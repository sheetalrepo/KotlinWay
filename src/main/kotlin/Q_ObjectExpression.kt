/**
 * To implement singleton we can use 'object' expression
 * In Java, we have to do a lot of effort to make class as singleton
 *
 * object className{}
 */

//POJO
data class Book (var name: String, var price: Int)

//Singleton Class
object BookShelf {
    var listOfBooks = arrayListOf<Book>()

    fun printBooks(){
        for(bk in listOfBooks)
            println(bk.name+": "+bk.price)
    }
}

//Main Func
fun main() {
    println("\n=========== ProdBug ==========")

    var b1 = Book("Kotlin Book", 100)
    var b2 = Book("Java Book", 200)
    var b3 = Book("C++ Book", 300)

    BookShelf.listOfBooks.add(b1)
    BookShelf.listOfBooks.add(b2)
    BookShelf.listOfBooks.add(b3)

    //ClassName.methodName()
    BookShelf.printBooks()
}

