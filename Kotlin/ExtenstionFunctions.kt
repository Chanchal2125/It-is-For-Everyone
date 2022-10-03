fun main() {
    print("Please enter a number: ")
    val input = readLine()?.toInt()
    if(input != null){
        println("$input is prime: ${input.isPrime()}")
    }
}

fun Int.isPrime(): Boolean{
    for(i in 2 until this / 2){
        if(this % i == 0) return false
    }
    return true
}