package main.kotlin

import java.util.TreeMap


fun main(args: Array<String>){

    val list = listOf(9, 3, 9, 3, 9, 7, 9)

    oddOccurrencesInArray2(list)

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

fun oddOccurrencesInArray2(numbers:List<Int>): Int{


    val hashSet = HashSet<Int>()


    for ( index in numbers.indices){

        val value = numbers[index]

        if (hashSet.contains(value)){
            hashSet.remove(value)
        }else{
           hashSet.add(value)
        }


    }


    println(hashSet.iterator().next())
    return  hashSet.iterator().next()
}