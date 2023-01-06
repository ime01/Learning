package main.kotlin

import java.util.HashMap


fun main(args: Array<String>){

    val numbers = listOf(2, 4, 5, 1, 10, 44, 20, 19, 33, 55)
    val target = 11
    twoSumSolutionUnsortedArray(numbers.toIntArray(), target)

}


fun twoSumSolutionUnsortedArray(nums: IntArray, target: Int): IntArray? {
    val result = IntArray(2)

    val hm = HashMap<Int, Int>()

    for (i in nums.indices) {

        val comp = target - nums[i]

        if (hm.containsKey(comp)) {

            result[0] = hm[comp]!!
            result[1] = i

        } else {

            hm[nums[i]] = i

        }
    }
    return result
}


