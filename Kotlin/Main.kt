fun main() {
    var myVariable = 123
    val myConstant = 12
    var test: Boolean = true

    println(myVariable)
    myVariable = 321
    println("$myVariable is my roll number")
    println("$myConstant is a constant value which can't be changed")
    println(test)
    test = false
    println(test)

}