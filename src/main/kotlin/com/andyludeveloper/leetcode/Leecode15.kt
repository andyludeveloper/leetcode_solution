package com.andyludeveloper.leetcode

class Leecode15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        var a: Int
        var b: Int
        var c: Int
        var start: Int
        var end: Int
        val result = mutableListOf<List<Int>>()
        var target: Int
        for (index in 0 until nums.size - 2) {
            if (index != 0 && nums[index] == nums[index - 1]) continue

            a = nums[index]
            start = index + 1
            end = nums.size - 1
            target = -a

            while (start < end) {
                b = nums[start]
                c = nums[end]
                val sum = b + c
                when {
                    sum == target -> {
                        result.add(listOf(a, b, c))
                        end--

                        while (start < end && nums[start] == nums[end - 1]) {
                            start++
                        }
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--
                        }
                    }
                    sum < target -> start++
                    else -> end--
                }
            }
        }
        return result
    }
}