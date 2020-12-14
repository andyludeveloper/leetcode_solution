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
}

class Leetcode3 {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isNotEmpty()){
            val map = HashMap<Char, Int>()
            for (i in s){
                var value = map.getOrDefault(i, 0)
                map[i] = ++value
            }
            return map.size
        }
        return 0
    }

}
