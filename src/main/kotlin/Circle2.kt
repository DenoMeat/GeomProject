import kotlin.math.sqrt

class Circle2 : Figure {
    constructor(coord_in: Array<point>) : super(coord_in) {
        if (coord_in.size == 2) vertices = coord_in
        else println("Не не не, вводи по-другому.")
    }


    fun area(): Double {
        val area: Double
        val r = sqrt(
                (vertices[0].x - vertices[1].x) * (vertices[0].x - vertices[1].x) +
                        (vertices[0].y - vertices[1].y) * (vertices[0].y - vertices[1].y)
        )
        area = Math.PI * r * r
        return area
    }
}
