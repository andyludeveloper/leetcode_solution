package com.andyludeveloper.leetcode

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Leetcode11Test : FunSpec({

    test("[1,8,6,2,5,4,8,3,7] should return 49") {
        val intArray = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val sut = Leetcode11()
        sut.maxArea(intArray) shouldBe 49
    }
    test("[1,1] should return 1") {
        val intArray = intArrayOf(1, 1)
        val sut = Leetcode11()
        sut.maxArea(intArray) shouldBe 1
    }
    test("[4,3,2,1,4] should return 1") {
        val intArray = intArrayOf(4,3,2,1,4)
        val sut = Leetcode11()
        sut.maxArea(intArray) shouldBe 16
    }
    test("[1,2,1] should return 1") {
        val intArray = intArrayOf(1,2,1)
        val sut = Leetcode11()
        sut.maxArea(intArray) shouldBe 2
    }

})
