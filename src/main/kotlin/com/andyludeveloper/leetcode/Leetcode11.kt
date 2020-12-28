package com.andyludeveloper.leetcode

import kotlin.math.max
import kotlin.math.min

class Leetcode11 {

    fun maxArea(height: IntArray): Int {
        var maxArea = 0

        for (i in height.size - 1 downTo 0) {
            var times = 0
            while (i + times < height.size) {
                maxArea = max(min(height[times], height[i + times]) * i, maxArea)
                times++
            }
        }

        return maxArea
    }
}