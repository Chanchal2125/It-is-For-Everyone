fun main() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val list2 = mutableListOf(1,2,3)
    array[0] = 3
    list2[0] = 3
    list2.add(4)
    list2.remove(3)
    println(list)
    println(list2)

    val age = readLine()?.toInt()
    when(age){
        in 0..12 -> println("You are a young kid")
        in 13..17 -> println("You are a teenager")
        18 -> println("Finally, you're 18")
        19, 20 -> println("You are a young adult")
        in 21..65 -> println("You are an adult")
        else -> println("You're really old")
    }
}