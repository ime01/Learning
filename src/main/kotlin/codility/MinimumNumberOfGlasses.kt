package main.kotlin


fun main(args: Array<String>){

    minimumNoOfGlasses(4, 10)

}

fun minimumNoOfGlasses(N:Int, K:Int): Int{

    var minimumNoOfGlasses = 0
    var additionValue = 0
    var sum = 0

     for (value in  0  until N) {
         sum += value
    }

    if (sum<N){
        minimumNoOfGlasses = -1
    }else{

        for (value in 0..N){

            if (value == K){
                minimumNoOfGlasses = 1
            }
        }


        if (K>sum){


        }


        for (numbers in N downTo   0){
            val list = mutableListOf<Int>()

            list.add(numbers)

            for (numbs in list.indices){


            }



            additionValue += numbers
            minimumNoOfGlasses++

            if (additionValue==K){
                break
            } else{
                minimumNoOfGlasses = -1
            }
        }

    }


    println(minimumNoOfGlasses)
    return  minimumNoOfGlasses

}



fun codilityMaxNumWithNegativeValuePresent(A:List<Int>):Int{

    val length = A.size
    var answer = 0

    val newListWithPositiveAndNegative = mutableListOf<Int>()
    val newListWithPositiveAndNegative2 = listOf(-1, -2, -3, -4, -5)

    A.forEach {

        if (it<0){
            newListWithPositiveAndNegative.add(it)
        }
    }

    A.forEach {
        val highestNegative = newListWithPositiveAndNegative.minOrNull()

        if ((it + highestNegative!!)==0){
            answer = it
        }
    }

    println(answer)
    return answer

}


fun codilityPalindrome(N: Int, K: Int): String? {
    val alph = "abcdefghijklmnopqrstuvwxyz"
    val alphRev = "zyxwvutsrqponmlkjihgfedcba"
    val s: String
    val sRev: String
    var between = 0
    var bw = ""
    if (K > N / 2) {

        s = alph.substring(0, K)
        sRev = alphRev.substring(26 - K + 1, 26)
    } else {

        s = alph.substring(0, K)
        sRev = alphRev.substring(26 - K, 26)
        between = N - K * 2
        bw = "a".repeat(between)
    }
    println(s + bw + sRev)
    return s + bw + sRev
}