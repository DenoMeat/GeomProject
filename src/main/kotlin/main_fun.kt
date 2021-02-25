fun main(args: Array<String>) {

    var our_vertices: Array<point> = arrayOf(point(0.0, 0.0), point(0.0, 1.0), point(1.0,0.0))
    var our_triangle:Triangle = Triangle(our_vertices)

    println("Our triangle's area is ${our_triangle.Area()}")

    var i:Int = 0

    var our_vertices_rect: Array<point> = arrayOf(point(0.0, 0.0), point(6.0, 7.0))
    var our_rectangle: Rectangle = Rectangle(our_vertices_rect)

    println("Our rectangle's area is ${our_rectangle.Area()}")

}