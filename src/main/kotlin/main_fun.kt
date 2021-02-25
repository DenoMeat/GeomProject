fun main(args: Array<String>) {
    var i:Int = 0

    var our_vertices: Array<point> = arrayOf(point(0.0, 0.0), point(0.0, 1.0), point(1.0,0.0))
    var our_vertices_for_rectangle: Array<point> = arrayOf(point(0.0, 0.0), point(6.0, 7.0))
    var our_vertices_for_circle: Array<point> = arrayOf(point(0.0, 0.0), point(5.0, 5.0))
    var our_vertices_for_square2: Array<point> = arrayOf(point(0.0, 0.0), point(4.0, 0.0))
    var our_triangle:Triangle = Triangle(our_vertices)
    var our_square: Square = Square(our_vertices)
    var our_rectangle: Rectangle = Rectangle(our_vertices_for_rectangle)
    var our_circle: Circle = Circle(our_vertices_for_circle)
    var our_square2: Square2 = Square2(our_vertices_for_square2)

    println("Our triangle's area is ${our_triangle.area()}")
    println("Our square's area is ${our_square.area()}")
    println("Our triangle's area is ${our_rectangle.area()}")
    println("Our circle's area is ${our_circle.area()}")
    println("Our square2`s area is ${our_square2.area()}")
}
