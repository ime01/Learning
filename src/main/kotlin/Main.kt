package main.kotlin




fun main(args: Array<String>){

  //println(logDumpGetUnique())
  //println(numberListSlicing())
  //println(stringSlicing())
  //println(arraySlicing())
 // println(stringLesson())
  //println(stringLesson2())
  //println(logDumpGetUnique())
  //println(kotlinFilter())

   /* lambda(5){ _, word->

        println(word)
    }*/
    //collectionsT()
    //flatMap2()
    //iterating()
    //testNullList()
    //splitStringbyComma()
    //searchBinary()

    /*val abcd = {a:Int, b:Int ->
        println(a*b)
        b
    }*/
   // use(abcd)
   // removeSlash()
    //usingForEach()
    //getHighestAndFrequency(listOf(6, 8, 9, 0, 3, 4, 3, 6, 9, 6))

    //println(highestBinaryGap(34))

    //println(mostFrequentElement(listOf(6, 8, 9, 0, 3, 4, 3, 6, 9, 8, 100, 30, 10, 22, 99, 3, 4, 89, 30, 5, 6)))

    //println(giveHighestElementAndFrequency(listOf(11, 22, 32, 11, 2, 14, 22, 11, 9, 16, 5, 6, 31, 3)))

    //println(playingWithList())

    val ourList = listOf(11, 22, 32, 11, 2, 14, 22, 11, 9, 16, 5, 6, 31, 3)
    val ourList2 = arrayOf(11, 22, 32, 11, 2, 14, 22, 11, 9, 16, 5, 6, 31, 3)
    val ourList3 = ourList2.sorted()
    println(ourList3)
    println(binarySearchKotlin(ourList3, 9))


}

fun binarySearchKotlin(array: List<Int>, key:Int){

    if (array.isEmpty()) println("Array Empty")

    var numOfElementS = array.size
    var midPosition = 0
    //right we don't know position of searched element so -1 is outside of elements index position of any list
    var positionOfSearchedKey = -1
    var startPosition = 0
    var endPosition = numOfElementS-1

    //implementing a binary search
    while (startPosition<=endPosition){

        //use this one for safety
        midPosition = startPosition + (endPosition-startPosition)/2

        //this for large number sets might cause integer overflow
       // midPosition = (startPosition+endPosition)/2

        if (key==array[midPosition]){
            positionOfSearchedKey = midPosition
            break
        }
        else if (array[midPosition]<key){
            startPosition = midPosition+1
        }
        else{
            endPosition = midPosition-1
        }
    }
    if (positionOfSearchedKey>=0){
        println("The element searched for is found at position $positionOfSearchedKey")

    }else{

        println("Element searched for is not found at any position")
    }




}




fun playingWithList(){

    val ourList = listOf(11, 22, 32, 11, 2, 14, 22, 11, 9, 16, 5, 6, 31, 3)

    //break into bits
    val chunkedBy4 = ourList.chunked(4)

    //transform collection to single result
    val result = ourList.reduce { result, item ->
        result+item
    }
    println("Result is the sum of elements $result")


    //check if all elements match a condition
    data class User(val id: Int, val name: String, val isCricketLover: Boolean, val isFootballLover: Boolean)

    val user1 = User(id = 1, name = "Amit", isCricketLover = true, isFootballLover = true)
    val user2 = User(id = 2, name = "Ali", isCricketLover = true, isFootballLover = true)
    val user3 = User(id = 3, name = "Sumit", isCricketLover = true, isFootballLover = false)
    val user4 = User(id = 4, name = "Himanshu", isCricketLover = true, isFootballLover = false)

    val ourusers = listOf(user1, user2, user3, user4)

    val allLovesCricket = ourusers.all { it.isCricketLover }
    println("All loves cricket $allLovesCricket")

    val allLovesFootball = ourusers.all { it.isFootballLover }
    println("All loves football $allLovesFootball")

    //find an element based on a particular condition
    val userId3 = ourusers.find { it.id==3 }
    println("User with ID 3 is ${userId3?.name}")

    //Associating the data using some key
    val usersAssociatedWithId = ourusers.associateBy { it.id }
    println("Users and Id $usersAssociatedWithId")

    //removing duplicate elements
    val noDuplicates = ourList.distinct()
    println(noDuplicates)

    //combine 2 lists while removing duplicates
    val list2 = listOf(20, 4, 3, 22, 10, 7, 11, 10, 9, 6, 5, 11)
    val combinedLiist = ourList.union(list2)
    println("Combined List without duplicates $combinedLiist")

    //Getting Intersection of elements ie elements which appear in 2 lists
    val intersectingElements = ourList.intersect(list2)
    println("Intersecting numbers = $intersectingElements")


    //filter a collection based on some condition
    val filteredList = ourList.filter { it % 2 ==0 }
    //this gives even numbers only
    println(filteredList)

    //zip will pair items of 2 collections until the lasts pair that can be made
    val listOne = listOf(1, 2, 3, 4, 5)
    val listTwo = listOf("a", "b", "c", "d", "e", "f")
    println(listOne zip listTwo) // [(1, a), (2, b), (3, c), (4, d), (5, e)]

    //zip with next, will pair items based on the item next to it
    val list = listOf(1, 2, 3, 4, 5)
    println(list.zipWithNext())

    //divide list into 2 based on a condition
    val (footballLovers, nonFootballLovers)= ourusers.partition { it.isFootballLover }
    println("Football Lovers $footballLovers")
    println("Non Football Lovers $nonFootballLovers")

    //groupBy based on some condition here it's remainder after diving by4
    println(ourList.groupBy { it % 4 })

    //sort elements of a collection by using sorted
    println(ourList.sorted())

    //example return position of element
    //LINEAR SEARCH
    val searchValue =9
    ourList.forEachIndexed { index, value ->
        if (value==9){
            println("2position of 9 is $index")
        }
    }






}







fun giveHighestElementAndFrequency(array:List<Int>){

    var highestElementCount = 0

    val highestElement = array.maxOrNull()

    for ( numbers in array){

         highestElementCount = array.count { it == highestElement }
    }

    println("highest Element is $highestElement, and the Frequency is $highestElementCount")

}




//most frequent element in an array

fun mostFrequentElement(array:List<Int>) {

    var numberWithHighestFrequency = 0
    val numbersAndFrequency = mutableMapOf<Int, Int>()

    for ( numbers in array){
       
        val eachCount = array.count { it==numbers }

            numbersAndFrequency[numbers] = eachCount
        }

    val highestFrequency = numbersAndFrequency.values.maxOrNull()

    for ((key, value) in numbersAndFrequency){
        if (value== highestFrequency){
            numberWithHighestFrequency = key
        }
    }
    println("Number with Highest Frequency is $numberWithHighestFrequency and the frequency is ${numbersAndFrequency.values.maxOrNull()}")


}


//get the highest binary gap of a number

fun highestBinaryGap(N: Int): Int {
    // write your code in Kotlin 1.6.0 (Linux)

    val binaryValues = Integer.toBinaryString(N)
        .replace(Regex("0+$"), "")

    val zerosOnly = binaryValues.split(Regex("1+"))

    val lengths = zerosOnly.map( String::length)
        .filter { it >0 }

    return lengths.maxOrNull()!!.or(0)
}


//get highest element in an array and print the frequency
fun getHighestAndFrequency(array:List<Int>){
    var count = 0

    //highest Number  = max
    val highest = array.maxOrNull()

    //getting frequency with counting the amount of times it appears
    for ( numbers in array){
        if (numbers==highest){
            count++
        }
    }
    val freq = array.count { it==highest }

    println("Highest number is $highest And frequency is $count And frequency using count method is $freq")

}




fun testNullList(){
    val x = null
    val l = listOf(x)

    println(l)
}

fun usingForEach(){
    val aList = mutableListOf(1,2, 3, 4, 5, 6, 7, 8, 9, 1, 10)

    aList.forEachIndexed { index, value ->

        if ((aList[0]) == aList[index] ){
            println("1ST NUMBER OCCURS")
        }

        if (aList[value]== 8){
            println(aList[index])
        }

        //val valueAtPosition = aList[index]
        //println(value)

    }

}

fun removeSlash(){

    val receivedString =
        "{\"property_type\":[\"residential\"],\"status\":[\"active\"],\"category\":[\"sale\"],\"page_size\":8,\"cur_page\":1}"

    val changedString = receivedString.replace("\"".toRegex(), "\"")

    println( changedString)
    
}


fun use(myFunction: (a:Int, b:Int) -> Int){
 myFunction.invoke(2, 6)
}


val calc = { x: Int, y:Int -> x * y }
val action = { println("Hello, world") }

fun higherOrderFunctions(){
   // declaring them
    val action = { println("Hello, world") }
    val calc = { x: Int, y:Int -> x * y }
}


fun iterating(){
    val s = "abc"
    for (i in 0..s.lastIndex){
        println(s[i]+1)
    }
}

fun flatMap2(){

    val community = listOf(Person("john", 22), Person("Mike", 45), Person("james", 36))
    val meetings = listOf(Meeting(1, "Board room meeting"), Meeting(2,"Tenants meeting"), Meeting(3, "Estate meeting"))

    val meetingsPeople: List<List<Person>> = meetings
        .map(Meeting::people)

    //from the above to get list of persons, not list of list of persons we use flatmap
    //use disticnt to make each unique, no repetition
    val meetingsPeople1: List<Person> = meetings
        .flatMap(Meeting::people)
        .distinct()

    for (p in meetingsPeople1) println(p.name)

}
data class Person(val name: String, val age: Int)
class Meeting(val id:Int, val title: String){
    val people = listOf(Person("Sam", 22), Person("Luke", 2000))
}


fun searchBinary() {

    var myList = mutableListOf("Windows ", "Android", "ios","Chrome Os" )

    // arrange the items in ascending order
    myList.sort()


    // return element at a given position from the collection using search
    var searchResult = myList.binarySearch("ios")


    //handle search events
    if (searchResult < 0){
        println(" We could not find what you are looking for, check your spellings ")
    }else{ println("Result found at position:$searchResult " )

    }

    //display the item you searched and return "null" if there is no result
    println(myList.getOrElse(searchResult,{null}))
}


fun collectionsT(){
    //create a predicate
    val greaterThanThree ={v:Int -> v>3}


    val numbers = listOf(1,2,3,4,5)

    //are all values >3
    var largeInts = numbers.all { it>3 }
    println(largeInts)

    //any value >3
    largeInts = numbers.any { it > 3 }
    println(largeInts)

    //count
    var numberOfLargeInt = numbers.count { it>3 }
    println(numberOfLargeInt)

    //found
    var found = numbers.find(greaterThanThree)
    println(found)

}

sealed class Event{
    class SendEvents(id:Int, to:String) : Event()
    class ReceiveEvents(id:Int, to:String) : Event()
}


fun lambda(times:Int, block:(Int, String) -> Unit){

    repeat(times){index ->
      val word = randomWords.random()
      block(times, word)

    }
}

val randomWords = listOf(
    "hello",
    "hello1",
    "hello2",
    "hello3",
    "hello5",
    "hello6",
    "hello7",
    "hello8",
    "hello9",
    "hello10",
    "hello11",
    "hello12",
    "hello13",
)



fun kotlinFilter(){
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //get even numbers from list
    val evenNumbers = list.filter {
        it.rem(2)==0
    }

    //values and index from list
    val valuesAndIndex = list.filterIndexed { index, i ->
        i.rem(2)==0
    }

    //println(evenNumbers)
    println(valuesAndIndex)


    //get even numbers from map
    val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five", 6 to "six")

    val mapEvenNumbers = map.keys.filter {
        it.rem(2)==0
    }
    println(mapEvenNumbers)



}

fun logDumpGetUnique(): String {


    var log_dump : String = "name=John Trust, username=john3, email=john3@gmail.com, id=434453; name=Hannah Smith, username=hsmith, email=hsm@test.com, id=23312; name=Hannah Smith, username=hsmith, id=3223423, email=hsm@test.com; name=Robert M, username=rm44, id=222342, email=rm@me.com; name=Robert M, username=rm4411, id=5535, email=rm@me.com; name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com; name=Robert Nick, username=rnick33, id=23432, email=rnick@gmail.com; name=Robert Nick II, username=rnickTemp34, id=23432, email=rnick@gmail.com; name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com;"

    // code goes here
    var astring = ""


    var ans = arrayListOf<String>()
    var ans2 = arrayListOf<String>()


    val stringsArrayList = log_dump.split(";").toTypedArray().toMutableList()
    stringsArrayList.removeAt(2)

    stringsArrayList.forEachIndexed { index, s ->
        //  var firstUser = it.substringBefore(";")

        if (index == 0 || index == 1){
          val  aastring = s.substringBefore(", id")
            val colon = ";"
            astring = "$aastring$colon"
            ans.add(astring)

        }else{
            // val  data = s.substringBefore("id")
            //   val new = s.substringAfter("email")

            //   string = data + "email" +  new


            val  adata = s.substringBefore("id")
            val new = s.substringAfter(adata).substringAfter(" ")

            val colon = ";"
            astring = "$adata$new$colon"
            ans.add(astring)

        }

    }

    //ans.removeAll(listOf("", null))
    ans.forEach {
        val substring  = it.substringBefore("com")
        val colon = "com;"
        val modified = "$substring$colon"
        ans2.add(modified)
    }
    println(ans2.toString())


    return ans.joinToString()

}

fun splitStringbyComma(){
    val phoneNumbers = "01-700 0250,01-448 3900,0700 022 5543"

    var phoneLine1 = ""
    var phoneLine2 = ""
    var phoneLine3 = ""

    val firstComma = phoneNumbers.indexOf(",")

    if (firstComma >= 0){
        phoneLine1 = phoneNumbers.substring(0, firstComma)

        val secondComma = phoneNumbers.indexOf(",", firstComma+1)

        if (secondComma>=0) {
            phoneLine2 = phoneNumbers.substring(firstComma+1, secondComma)

            phoneLine3 = phoneNumbers.substring(secondComma + 1)//that is from second comma to end of words

        }else{
            phoneLine2 = phoneNumbers.substring(firstComma+1)// if no second comma, then second word is first space then all words till the end
        }
    }else{
        phoneLine1 = phoneNumbers
    }



    println(phoneLine1)
    println(phoneLine2)
    println(phoneLine3)
}



fun stringLesson2(){
    val words = "cat, horse, fish"

    //look for the first comma and take the words before it as first substring
    //starting one position past the place where first comma is found above, search for another comma, take the substring before it as second word
    //starting one space after the second comma we take the substring to the end of the input as the third word

    var word1 = ""
    var word2 = ""
    var word3 = ""

    val firstComma = words.indexOf(",")

    if (firstComma >= 0){
        word1 = words.substring(0, firstComma)

        val secondComma = words.indexOf(",", firstComma+1)

        if (secondComma>=0) {
            word2 = words.substring(firstComma+1, secondComma)

            word3 = words.substring(secondComma + 1)//that is from second comma to end of words

        }else{
            word2 = words.substring(firstComma+1)// if no second comma, then second word is first space then all words till the end
        }
    }else{
        word1 = words
    }

     word1 = word1.trim()
     word2 = word2.trim()
     word3 = word3.trim()

    println(word1)
    println(word2)
    println(word3)
}



fun stringLesson(){

    val word = "flashpointa"

    //searchFromEndOfString
    val searchFromEnd = word.lastIndexOf("t")
    val searchFromEndWithIndex = word.lastIndexOf("t", 3)
    println(searchFromEnd)


    //start searching after a particular index position
    val searchAfter2ndPosition = word.indexOf("a", 3)
    println(searchAfter2ndPosition)


    //to check if a character or string is found within the string and return the index position where found
    //if this is not found it returns -1
    val checkIfFound = word.indexOf("hp")
    val s = "po"
    val checkIfFound1 = word.indexOf(s)
    val notFound = "real"
    val checkIfFound2 = word.indexOf(notFound)

    println(checkIfFound)
    println(checkIfFound1)
    println(checkIfFound2)



    //substring from index position to the end
    val substringfromIndex = word.substring(6)

    //start from one index ends right before the next index
    val substringFromIndexStopsBeforeNextIndex = word.substring(1, 4)

    println(substringfromIndex)
    println(substringFromIndexStopsBeforeNextIndex)

}



fun arraySlicing(){
    val sampleArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //get values from one index position to another
    val sliceRange = sampleArray.sliceArray(2..5)

    //print element at index positions given
    val elementAtIndexPosition = sampleArray.sliceArray(setOf(5,2,0))

    //print elements starting at the end of the list
    val newList = "Canada"
    val elementsFromListEnd = newList.reversed().slice(0..3)

    println(sliceRange.contentToString())
    println(elementAtIndexPosition.contentToString())
    println(elementsFromListEnd)
}



fun stringSlicing(){
    val sampleString = "abcdefghi"

    //get values from one index position to another
    val sliceRange = sampleString.slice(2..5)

    //print element at index positions given
    val elementAtIndexPosition = sampleString.slice(setOf(5,2,0))

    println(sliceRange)
    println(elementAtIndexPosition)
}


fun numberListSlicing(){
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //get values from one index position to another
    val sliceRange = numbersList.slice(1..3)

    //print values skipping one number(step 2)
    val step2 = numbersList.slice(0..5 step 2)

    //print element at index positions given
    val elementAtIndexPosition = numbersList.slice(setOf(3,4,1))

    println(sliceRange)
    println(step2)
    println(elementAtIndexPosition)
}



















fun replaceSolution(S: String): String {
    // write your code in Kotlin 1.3.11 (Linux)
    var  newStringAnswer = ""

    var replacedPlusString = S.replace("plus", "+")
    var replacedMinusString = S.replace("minus", "-")


     newStringAnswer = "$replacedPlusString$replacedMinusString"

    return  newStringAnswer
}


fun solution1(S: String): Int {
    // write your code in Kotlin 1.3.11 (Linux)

    var answer :Int = 0

   for (i in 0..S.length-1) {

        if (!S[i].equals(S[i+1])){
            answer++
        }
}


    S.forEachIndexed { index, element ->
        // ...
        if (!S[index].equals(S[index+1])){
            answer++
        }

    }


    return answer
}

