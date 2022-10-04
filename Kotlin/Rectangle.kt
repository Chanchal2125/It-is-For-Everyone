class Rectangle(
    private val length: Double,
    private val breadth: Double
) : Shape("Rectangle") {

    constructor(a: Double) : this(a, a)
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    init {
        println("$name created with length $length & breadth $breadth")
    }

    override fun area() = length * breadth
    override fun perimeter() = (length + breadth) * 2
}