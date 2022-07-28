import java.math.BigInteger

/**
 * 1. Factorial using Recursion
 * 2. Big Integer
 */

fun main(args: Array<String>) {
    println("\n=========== ProdBug ==========")
    println(fact(5))
    println(fact(40))
    println(factForBig(BigInteger("60")))
}

fun fact(num: Int): Int {
    if (num == 0)
        return 1;
    else
        return num * fact(num - 1)
}

fun factForBig(num: BigInteger): BigInteger {
    if (num == BigInteger.ZERO)
        return BigInteger.ONE;
    else
        return num * factForBig(num - BigInteger.ONE)
}