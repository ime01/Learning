package main.kotlin

import java.util.*


fun main(args: Array<String>){

}


fun findMaximumApples(A: IntArray?, k: Int, l: Int): Int {
    val ans1: Int = findMaximumApplesImpl(A, k, l)
    val ans2: Int = findMaximumApplesImpl(A, l, k)
    return Math.max(ans1, ans2)
}

private fun findMaximumApplesImpl(A: IntArray, k: Int, l: Int): Int {
    if (k + l > A.size) {
        return -1
    }
    val sum = IntArray(1000)
    sum[0] = A[0]
    for (i in 1 until A.size) {
        sum[i] = sum[i - 1] + A[i]
    }
    var max = -1
    var x = 0
    var y = 0
    var a = 0
    while (a + k - 1 < A.size) {
        x = if (a > 0) sum[a + k - 1] - sum[a - 1] else sum[a + k - 1]
        var b = a + k
        while (b + l - 1 < A.size) {
            y = if (b > 0) sum[b + l - 1] - sum[b - 1] else sum[b + l - 1]
            if (x + y > max) {
                max = x + y
            }
            b++
        }
        a++
    }
    return max
}
fun solution(A: Array<String>, B: Array<String>, P: String?): String? {
    val sortedContacts = TreeSet<String>()
    for (i in B.indices) if (B[i].contains(P!!)) sortedContacts.add(A[i])
    return if (sortedContacts.isEmpty()) "NO CONTACT" else sortedContacts.first()
}



fun solution2(message: String, K: Int): String? {
    // Implement your solution here
    return if (message.length <= K) {
        message
    } else {
        val words = message.substring(0, K + 1).split(" ".toRegex()).toTypedArray()
        java.lang.String.join(" ", *words.copyOfRange(0, words.size - 1))
    }
}
