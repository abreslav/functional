package fibonacci

import kotlin.test.assertEquals

fun testFib(fib: (Int) -> Int) {
    assertEquals(1, fib(0))
    assertEquals(1, fib(1))
    assertEquals(2, fib(2))
    assertEquals(3, fib(3))
    assertEquals(5, fib(4))
    assertEquals(8, fib(5))
    assertEquals(13, fib(6))
    assertEquals(21, fib(7))
}

fun main(args: Array<String>) {
    testFib { n -> fib(n) }
    testFib { n -> fib_imp(n) }
    testFib { n -> fib_tco(n) }
}