package com.andyludeveloper.leetcode

class Leetcode3 {
    //12/17/2020 06:38	Accepted	408 ms	38.4 MB	kotlin
    fun lengthOfLongestSubstring(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        val length = mutableListOf<Int>()
        var result: Int
        for(i in s.indices) {
            map.clear()
            result = 0
            for (j in i until s.length) {
                val value = map.getOrDefault(s[j], 0)
                if (value == 0) {
                    result++
                    map[s[j]] = 1
                } else {

                    break
                }
            }
            length.add(result)
        }
        return length.maxOrNull()?:0
    }
}