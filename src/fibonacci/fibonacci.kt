package fibonacci

fun fib(n: Int): Int =
        when (n) {
            0, 1 -> 1
            else -> fib(n - 1) + fib(n - 2)
        }



























fun fib_imp(n: Int): Int {
    var a = 1
    var b = 1
    for (i in 1..n) {
        val t = a + b
        a = b
        b = t
    }
    return a
}





















fun fib_tco(n: Int): Int {
    fun fib_tco(n: Int, a: Int, b: Int): Int =
            when (n) {
                0 -> a
                else -> fib_tco(n - 1, b, a + b)
            }
    return fib_tco(n, 1, 1)
}