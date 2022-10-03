import java.lang.NumberFormatException

fun main() {
    try {
        val input = readLine()?.toInt()
    } catch (e : NumberFormatException){
        print(e.toString())
    }

    println(divide(5, 0))
}

class DivisionByZeroException: Exception("You cannot divide by zero. Please choose a different number")

fun divide(a: Int, b: Int): Int{
    if(b == 0) throw DivisionByZeroException()
    return a/b
}