package com.example.exercise1

import java.text.DecimalFormat

fun characterPercentage(inputString: String) {
    val totalChars = inputString.length
    var upperCaseLetters = 0
    var lowerCaseLetters = 0
    var digits = 0
    var others = 0

    for (i in 0 until inputString.length) {
        val ch = inputString[i]
        if (Character.isUpperCase(ch)) {
            upperCaseLetters++
        } else if (Character.isLowerCase(ch)) {
            lowerCaseLetters++
        } else if (Character.isDigit(ch)) {
            digits++
        } else {
            others++
        }
    }
    val upperCaseLetterPercentage = upperCaseLetters * 100.0 / totalChars
    val lowerCaseLetterPercentage = lowerCaseLetters * 100.0 / totalChars
    val digitsPercentage = digits * 100.0 / totalChars
    val otherCharPercentage = others * 100.0 / totalChars
    val formatter = DecimalFormat("##.##")

    println("In '$inputString' : ")
    System.out.println(
        "Uppercase letters are " + formatter.format(
            upperCaseLetterPercentage
        ).toString() + "% "
    )
    System.out.println(
        "Lowercase letters are " + formatter.format(
            lowerCaseLetterPercentage
        ).toString() + "%"
    )
    System.out.println(
        "Digits Are " + formatter.format(digitsPercentage).toString() + "%"
    )
    System.out.println(
        "Other Characters Are " + formatter.format(otherCharPercentage).toString() + "%"
    )

}

fun main(args: Array<String>) {
    characterPercentage("Krishna PRATAP Singh RatHORE @123/")
    characterPercentage("Heloo $$$ My nAME is @@")
    characterPercentage("Mob NO. 79856@@@")
}
