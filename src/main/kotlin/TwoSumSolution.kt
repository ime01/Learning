package main.kotlin


fun main(args: Array<String>){

    val numbers = listOf(2, 4, 5, 1, 10, 44, 20, 19, 33, 55)
    val target = 11
    twoSumSolution(numbers, target)

}

fun twoSumSolution(numbers: List<Int>, target:Int): IntArray{
    // This applies to a sorted array in ascending order, leetcode question 167

    var result = mutableListOf<Int>()
    var left = 0
    var right = numbers.size-1

    while (left < right){

        val leftValue = numbers[left]
        val rightValue = numbers[right]

        if (leftValue + rightValue == target){

            result.add(0, left+1)
            //result[0] = left+1
           // result[1] = right+1
            result.add(1, right+1)
            break

        }else if (leftValue + rightValue < target){
            //move left pointer to the right to add more values
            left++
        }else{
            //move right pointer to the left to decrease values
            right--
        }

    }

    println(result)
    return result.toIntArray()
}