package com.andyludeveloper.leetcode

import org.junit.Test

//Longest Palindromic Substring
class Leetcode5Test {
    @Test
    fun `single character`() {
        val sut = Leetcode5()
        val result = sut.longestPalindrome("a")
        assert(result == "a")
    }

    @Test
    fun `two characters`() {
        val sut = Leetcode5()
        val result = sut.longestPalindrome("ab")
        assert(result == "a")
    }

    @Test
    fun `four characters cbbd should return bb`() {
        val sut = Leetcode5()
        val result = sut.longestPalindrome("cbbd")
        assert(result == "bb")
    }
    @Test
    fun `four characters babad should return bab`() {
        val sut = Leetcode5()
        val result = sut.longestPalindrome("babad")
        assert(result == "bab")
    }

}