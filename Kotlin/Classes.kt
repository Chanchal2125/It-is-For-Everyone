fun main() {
    val rectangle = Rectangle(12.0, 11.0)
    val circle = Circle(12.5)
    val rectangle2 = Rectangle(5.0)

    val a = 3.0
    val b = 4.0
    val h = 2.0
    val parallelogram = object: Shape("Parallelogram", a, b, h){
        override fun area(): Double {
            return a * h
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }
    }
    val circle2 = Circle.randomCircle()

    println("Rectangle's area is: ${rectangle.area()}")
    println("Rectangle's perimeter is: ${rectangle.perimeter()}")
    circle.changeName("Peter")

    println(maxArea(rectangle, circle, rectangle2))
}

fun maxArea(shape1: Shape, shape2: Shape): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double{
    val maxArea1 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if(maxArea1 > areaShape3) maxArea1 else areaShape3
}