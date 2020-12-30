package com.andyludeveloper.leetcode

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Leecode15Test : FunSpec(
    {
    test("threeSum [-1, 0, 1, 2, -1, -4] should return [[-1, -1, 2], [-1, 0, 1]]") {
        val intArray = intArrayOf(-1, 0, 1, 2, -1, -4)
        val sut = Leecode15()
        sut.threeSum(intArray) shouldBe listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
    }
    test("threeSum [] should return []") {
        val intArray = intArrayOf()
        val sut = Leecode15()
        sut.threeSum(intArray) shouldBe listOf()
    }

    test("threeSum [0] should return []") {
        val intArray = intArrayOf()
        val sut = Leecode15()
        sut.threeSum(intArray) shouldBe listOf()
    }
    test("threeSum [0,0,0,0] should return [[0,0,0]]") {
        val intArray = intArrayOf(0,0,0,0)
        val sut = Leecode15()
        sut.threeSum(intArray) shouldBe listOf(listOf(0,0,0))
    }
    test("threeSum [0,0,0] should return [[0,0,0]]") {
        val intArray = intArrayOf(0,0,0)
        val sut = Leecode15()
        sut.threeSum(intArray) shouldBe listOf(listOf(0,0,0))
    }
    test("threeSum [-1,0,1,2,-1,-4,-2,-3,3,0,4] should return [[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]") {
        val intArray = intArrayOf(-1,0,1,2,-1,-4,-2,-3,3,0,4)
        val sut = Leecode15()
        sut.threeSum(intArray) shouldBe listOf(
            listOf(-4,0,4),
            listOf(-4,1,3),
            listOf(-3,0,3),
            listOf(-3,1,2),
            listOf(-2,-1,3),
            listOf(-2,0,2),
            listOf(-1,-1,2),
            listOf(-1,0,1)
        )
    }
})
