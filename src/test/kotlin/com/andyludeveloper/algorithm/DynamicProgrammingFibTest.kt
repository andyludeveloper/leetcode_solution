package com.andyludeveloper.algorithm

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.blocking.forAll
import io.kotest.data.forNone
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class DynamicProgrammingFibTest : FunSpec({
    val sut = DynamicProgrammingFib()
    test("fib") {
        sut.fib(0) shouldBe 1
        sut.fib(1) shouldBe 1
        sut.fib(2) shouldBe 2
        sut.fib(5) shouldBe 8
    }
    test("fibDP") {
        forAll(
            row(35, 14930352),
            row(5, 8),
            row(3, 3),
            row(1, 1),
            row(0, 1),
        ){ i, result ->
            sut.fibDP(i) shouldBe result
        }
    }
    test("fibDP bottom up approach") {
        forAll(
            row(35, 14930352),
            row(5, 8),
            row(3, 3),
            row(1, 1),
            row(0, 1),
        ){ i, result ->
            sut.fibDPBottomUp(i) shouldBe result
        }
    }
})
