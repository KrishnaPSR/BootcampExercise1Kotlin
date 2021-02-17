package com.example.exercise1

fun main(args: Array<String>) {
    val arr1 = intArrayOf(1,2,3,4,5,6,7,8,9)
    val arr2 = intArrayOf(1,2,3,4,5,10,12,14,15)
    for (i in arr1.indices) {
        for (j in arr2.indices) {
            if (arr1[i] == arr2[j]) {
                println(arr1[i])
            }
        }
    }
}