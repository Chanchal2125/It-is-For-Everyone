fun main() {
    printThreeLines()
    print(sum(4, 5))
    val ans = getMax(1, 2, 3, 4, 4, 5, 5, 6, 7, 8)
    println(ans)

    searchFor("How to become a great android developer?", "Bing")
    searchFor("How to become a great android developer?")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}

fun getMax(vararg numbers: Int): Int {
    var max = Int.MIN_VALUE
    for (number in numbers) {
        if (number > max) max = number
    }
    return max
}

fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for '$search' on $searchEngine")
}