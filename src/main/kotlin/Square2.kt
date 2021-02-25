import kotlin.math.sqrt

class Square2: Figure {
        constructor(coord_in: Array<point>): super(coord_in) {
            if (coord_in.size == 2) vertices = coord_in
            else println("Подумай еще раз")
        }

        fun area():Double{
            return (vertices[0].x-vertices[1].x)*(vertices[0].x-vertices[1].x) +
                    (vertices[0].y-vertices[1].y)*(vertices[0].y-vertices[1].y)
        }
    }