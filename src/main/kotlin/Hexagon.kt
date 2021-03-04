import kotlin.math.*

class Hexagon: Figure {
    /*
    Класс для вычисления площади правильного ШЕСТИУГОЛЬНИКА
    Надо ввести координаты двух соседних
    вершин правильного шестиугольника
    */
    constructor(coord_in: Array<point>): super(coord_in) {
        if(coord_in.size == 2) vertices = coord_in
        else println("think more")
    }
    fun area(): Double {
        val area: Double
        val a: Double
        val R: Double
        a = abs(sqrt(((vertices[1].x - vertices[0].x).pow(2)) + ((vertices[1].y - vertices[0].y).pow(2))))
        R = a
        area = (3 * sqrt(3.0) * (R.pow(2))) / 2
        return area
    }
}

