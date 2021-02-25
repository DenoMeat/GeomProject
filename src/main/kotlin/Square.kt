import kotlin.math.abs

class Square:Figure {
    constructor(coord_in: Array<point>): super(coord_in) {
        if (coord_in.size == 2) vertices = coord_in
        else println("Are you crazy?")
    }
    // Конструктор класса принимает
    // только две верхние вершины
    fun Area():Double{
        return (vertices[0].x-vertices[2].x)*(vertices[0].x-vertices[2].x) +
                (vertices[0].y-vertices[2].y)*(vertices[0].y-vertices[2].y)
    }
}