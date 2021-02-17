package com.example.exercise1
/*program to find the number of occurrences of the duplicate words in a string and print them.*/
import java.util.HashMap

fun duplicateWords(inputString: String) {
    val words = inputString.split(" ").toTypedArray()
    val wordCount: MutableMap<String, Int?> =
        HashMap()
    for (word in words) {
        if (wordCount.containsKey(word)) {
            wordCount[word] = wordCount[word]!! + 1
        } else {
            wordCount[word] = 1
        }
    }
    val wordsInString: Set<String> = wordCount.keys
    for (word in wordsInString) {
        if (wordCount[word]!! > 1) {
            println(word + " = " + wordCount[word])
        }
    }

}
fun main(args: Array<String>) {
    duplicateWords("Krishna Krishna Pratap Pratap")
}

