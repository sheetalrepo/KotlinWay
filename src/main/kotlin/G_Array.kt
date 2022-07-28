/**
 * Array
 */

fun main(args: Array<String>) {
    //arrayEg()
    //arrayEg2()
    arrayString()
}


fun arrayEg() {
    println("=========== ProdBug ==========")

    var nums = intArrayOf(11, 12, 13, 14, 15)
    nums[1] = 100

    println(">>>> "+ nums[3])
    println(">>>> "+ nums.last())
    println(">>>> "+ nums.size)
    for (i in nums)
        println(i)
}

fun arrayEg2() {
    println("=========== ProdBug ==========")

    var nums = IntArray(3)
    nums[0] = 100
    nums[1] = 200
    nums[2] = 300

    for (i in nums)
        println(i)
}



fun arrayString() {
    println("=========== ProdBug ==========")

    var arr = arrayOfNulls<String>(3)
    arr[0] = "Alpha"
    arr[1] = "Beta"
    for (str in arr)
        println(str)


    var arr2 = arrayOf("A","B","C")
    for (str2 in arr2)
        println(str2)
}