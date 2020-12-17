package com.andyludeveloper.leetcode

import org.junit.Test
import kotlin.test.expect

//Longest Palindromic Substring

class Leetcode5Test {
    @Test
    fun `single character`() {
        val sut = Leetcode5()
        val result = sut.longestPalindrome("a")
        assert(result == "a")
    }
}