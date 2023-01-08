package main.kotlin


fun main(args: Array<String>){

    binaryGap(1041)

}

fun binaryGap(number:Int): Int{
    var counter = 0
    var maxCount = 0
    var started:Boolean = false

    val binaryString = Integer.toBinaryString(number)

    for (pos in binaryString.indices ){

        val eachValue = binaryString.substring(pos, pos+1)

        if (eachValue == "1"){

            if (started){

                if(counter > maxCount){
                    maxCount = counter
                }
            }

            counter = 0
            started = true
        }
        if (eachValue == "0"){
            counter++
        }
    }

    println(maxCount)

    return maxCount
}