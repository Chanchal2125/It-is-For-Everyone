class CustomTriple<A: Any, B: Any, C: Any>(
    var first: A,
    var second: B,
    var third: C
){
    fun printTypes(){
        println("The type of first is: ${first::class}")
        println("The type of first is: ${second::class}")
        println("The type of first is: ${third::class}")
    }
}