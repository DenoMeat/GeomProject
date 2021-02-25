import kotlin.math.abs

class Rectangle: Figure {
    /*
    Конструктор класса принимает
    только левую верхнюю
    и правую нижнюю точки
    */
    constructor(coord_in: Array<point>): super(coord_in) {
        if(coord_in.size == 2) vertices = coord_in
        else println("Are you crazy?")
    }
    fun area(): Double {
        val area: Double
        val a: Double
        val b: Double
        a = abs(vertices[0].x- vertices[1].x)
        b = abs(vertices[0].y - vertices[1].y)
        area = a * b
        return area
    }
}
