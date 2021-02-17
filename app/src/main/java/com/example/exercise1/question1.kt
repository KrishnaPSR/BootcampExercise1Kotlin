package com.example.exercise1

/*program to replace a substring inside a string with another string.*/
class question1
fun main(args:Array<String>){
        var str1= "Krishna Bhavesh"
        var oldstr="Bhavesh"
        var newstr="Pratap"

        var output=str1.replace(oldstr ,newstr ,ignoreCase = false)
        print(output)
    }
