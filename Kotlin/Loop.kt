fun main() {
    val myArray = arrayOf(3, 2, 6, 4)
    val stringArray = arrayOf("hello", "guys", "what's up?")
    var i = 0

    // while loop
    while (i < stringArray.size){
        print(stringArray[i] + " ")
        i++
    }
    println()


    // for loops
    for (j in stringArray){
        print("$j ")
    }
    println()
    for (j in 0..2){
        print("${stringArray[j]} ")
    }
    println()
    for (j in 10 downTo 5 step 2){
        print("$j ")
    }
    println()
    for (j in 'a'..'z'){
        println(j)
    }
}