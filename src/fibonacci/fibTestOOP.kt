package fibonacci.oop

import kotlin.test.assertEquals
import fibonacci.fib
import fibonacci.fib_imp
import fibonacci.fib_tco

trait Fibonacci {
    fun get(n: Int): Int
}

fun testFib(f: Fibonacci) {
    assertEquals(1, f.get(0))
    assertEquals(1, f.get(1))
    assertEquals(2, f.get(2))
    assertEquals(3, f.get(3))
    assertEquals(5, f.get(4))
    assertEquals(8, f.get(5))
    assertEquals(13, f.get(6))
    assertEquals(21, f.get(7))
}

fun main(args: Array<String>) {
    class FibFunctional : Fibonacci {
        override fun get(n: Int): Int{
            return fib(n)
        }
    }

    testFib(FibFunctional())


    testFib(object : Fibonacci {
        override fun get(n: Int): Int {
            return fib_imp(n)
        }
    })


    testFib(object : Fibonacci {
        override fun get(n: Int): Int = fib_tco(n)
    })
}