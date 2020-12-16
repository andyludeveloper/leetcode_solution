package com.andyludeveloper.leetcode

import org.junit.Test

class Leetcode3Test {
    @Test
    fun `length 0 should return 0`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring("")
        assert(result == 0)
    }

    @Test
    fun `all characters is same should return 1`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring("bbbbb")
        assert(result == 1)
    }
    @Test
    fun `abcabcbb should return 3`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring("abcabcbb")
        assert(result == 3)
    }
    @Test
    fun `pwwkew should return 3`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring("pwwkew")
        assert(result == 3)
    }
    @Test
    fun `space should return 1`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring(" ")
        assert(result == 1)
    }
    @Test
    fun `dvdf should return 3`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring("dvdf")
        assert(result == 3)
    }
    @Test
    fun `asjrgapa should return 6`() {
        val sut = Leetcode3()
        val result = sut.lengthOfLongestSubstring("asjrgapa")
        assert(result == 6)
    }
}

