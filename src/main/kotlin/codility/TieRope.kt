package main.kotlin


fun main(args: Array<String>){



}

fun tieRopesolution(K: Int, A: IntArray): Int {
    var sum = 0
    var count = 0

    for (i in A.indices) {

        if (A[i] >= K) {
            count++
            sum = 0
        } else if (sum <= K) {

            sum = sum + A[i]

            if (sum >= K) {
                sum = 0
                count++
            }
        }
    }
    return count
}
