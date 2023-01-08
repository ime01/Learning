package main.kotlin


fun main(args: Array<String>){

   frogJump(10, 85, 30)

}

fun frogJump(X:Int, Y:Int, D:Int): Int{

    //NOTE X= startPosition, Y = TargetPosition, D = number of jumps it takes from start to get to equal or greater than Y

    val distance = Y-X
    var count = distance/D

    //val answer = ceil(((distance/D).toDouble()))
    val jumps = Math.ceil(distance / D.toDouble()).toInt()

    println(jumps)

    return  jumps

}
