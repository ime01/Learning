package main.kotlin

import java.util.TreeMap


fun main(args: Array<String>){

    val list = listOf(9, 3, 9, 3, 9, 7, 9)

    oddOccurrencesInArray(list)

}

fun oddOccurrencesInArray(numbers:List<Int>): Int{


    var unpairedElement = 0


    for ( value in numbers){

        val eachCount = numbers.count { it==value }

        if (eachCount == 1){
            unpairedElement = value
        }
    }


    println(unpairedElement)
    return unpairedElement
}