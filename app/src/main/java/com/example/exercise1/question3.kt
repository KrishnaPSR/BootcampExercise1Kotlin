package com.example.exercise1

fun main(args: Array<String>) {
        val s = "aaaaaaaaaaaaa "
        val totalcount = s.length
        val totalcount_afterRemove = s.replace("a", "").length
        val count = totalcount - totalcount_afterRemove
        println("Number of Occurence of a is :$count")
    }
