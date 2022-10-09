fun main() {
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    val integers = (1..10).toList().customFilter { i, string ->
        i > 5
    }
    println(integers)
    val customTriple = CustomTriple<Int, String, Boolean>(12, "hello", true)
    customTriple.printTypes()

    var shapes = listOf(circle1, circle2, rectangle1, rectangle2)
    shapes = shapes.customFilter { shape, _ ->
        shape.area() > 20.0
    }
    for (shape in shapes){
        println("${shape.name} has area: ${shape.area()}")
    }
}

// **Important** Creating and understanding Lambda Functions (using generics)
fun <T> List<T>.customFilter(filterFunction: (T, String) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if(filterFunction(item, "Hello")){
            resultList.add(item)
        }
    }
    return resultList
}