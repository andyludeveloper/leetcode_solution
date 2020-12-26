package com.andyludeveloper.algorithm

class DynamicProgrammingFib {
    fun fib(i:Int): Int{
        if(i == 0 || i == 1 ) return 1
        return fib(i-1) + fib(i -2)
    }
    var mem = emptyArray<Int?>()

    fun fibDP(i: Int): Int{
        if(mem.isEmpty()){
            mem = arrayOfNulls<Int?>(i+1)
        }
        if(mem[i] != null){
            return mem[i]!!
        }else{
            if(i == 0 || i == 1){
                mem[i] = 1
                return 1
            }
            mem[i] = fibDP(i-1) + fibDP(i-2)
            return mem[i]!!
        }
    }

    fun fibDPBottomUpMem(i: Int): Int{
        if(i == 0) return 1
        if(i == 1) return 1
        val mem = arrayOfNulls<Int>(i+1)
        mem[0] = 1
        mem[1] = 1

        for(index in 2 .. i){
           mem[index] = mem[index -1]!! + mem[index -2]!!
        }
        return mem[i]!!
    }

    fun fibDPBottomUp(i: Int): Int{
        if(i == 0) return 1
        if(i == 1) return 1
        var a = 1
        var b = 1
        var c = 0

        for(index in 2 .. i){
            c = a + b
            a = b
            b = c
        }
        return c
    }
}