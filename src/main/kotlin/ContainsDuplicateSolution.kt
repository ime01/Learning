package main.kotlin


fun main(args: Array<String>){

    val numbers = listOf(2, 4, 5, 1, 10, 44, 20, 19, 44, 5, 33, 55)
    val numbers2 = listOf(2,14,18,22,22)
    containsDuplicate2(numbers2)

}

fun containsDuplicate2(numbers: List<Int>): Boolean{

    val distinct = numbers.toSet()

    println(numbers.size!=distinct.size)

    return numbers.size!=distinct.size

}

fun <T> List<T>.equalsIgnoreOrder(other: List<T>) = this.size == other.size && this.toSet() == other.toSet()