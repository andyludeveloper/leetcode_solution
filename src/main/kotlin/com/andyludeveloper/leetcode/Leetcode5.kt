package com.andyludeveloper.leetcode

class Leetcode5 {
    fun longestPalindrome(s: String): String {
        var result = ""

        for(i in s.indices){
            for(j in i+1 .. s.length){
                val subString = s.subSequence(i, j).toString()
                if(isPalindrome(subString)){
                    if(result.isEmpty()){
                       result = subString
                    }else{
                        if(subString.length > result.length){
                            result = subString
                        }
                    }
                }
            }
        }
        return result
        }
}
fun isPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1
    while (l <= r) {
        if (s[l] != s[r]) {
            return false
        }
        l += 1
        r -= 1
    }
    return true
}