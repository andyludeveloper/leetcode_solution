package com.andyludeveloper.leetcode

import kotlin.math.max
import kotlin.math.min

class Leetcode11 {

    //Runtime 1056 ms
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

    //Runtime 212 ms
    fun maxArea2Points(height: IntArray): Int{
        var left = 0
        var right = height.size -1
        var maxArea = 0

        while(left < right){
            maxArea = max(min(height[left], height[right])*(right - left), maxArea)
            if(height[left]< height[right]){
                left++
            }else{
                right--
            }
        }
        return maxArea
    }
}