package main.kotlin


fun main(args: Array<String>){

    val list1 = listOf(2, 3, 1, 5).toIntArray()

    missingElement(list1)

}

    fun missingElement(A: IntArray): Int {
        val list = HashSet<Int>()

        for (i in 1..A.size + 1) {
            list.add(i)
        }
        for (i in A.indices) {
            list.remove(A[i])
        }

        println(list.iterator().next())
        return list.iterator().next()
    }


