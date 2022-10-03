import kotlin.random.Random
import kotlin.random.asJavaRandom

class Circle(
    private val radius: Double
) : Shape("Circle"){
    init {
        println("$name created with radius $radius")
        println("$name's area is: ${area()}")
        println("$name's area is: ${perimeter()}")
    }

    companion object{
        fun randomCircle(): Circle{
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    override fun area() = radius * radius * ImportantNumbers.PI
    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}