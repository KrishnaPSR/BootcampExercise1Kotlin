package com.example.exercise1



fun main(args: Array<String>) {
    val str = "bootcamp"
    val freq = IntArray(str.length)
    var i: Int
    var j: Int
    val string = str.toCharArray()
    i = 0
    while (i < str.length) {
        freq[i] = 1
        j = i + 1
        while (j < str.length) {
            if (string[i] == string[j]) {
                freq[i]++
                string[j] = '0'
            }
            j++
        }
        i++
    }
    i = 0
    while (i < freq.size) {
        if (string[i] != ' ' && string[i] != '0') {
            if (freq[i] % 2 == 0) {

            } else {
                print(string[i])
            }
        }
        i++
    }
}
