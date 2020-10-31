fun main(){
    val p1 = Point(5F, 10F)

    val p2 = Point(5F, 10F)
    println(p1==p2)

    println(p1.toString())
    println(p2.toString())
    println(p1.Symmetrytox())

}


class Point(x: Float, y: Float) {

    private val abcisa: Float = x
    private var ordinati: Float = y

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (abcisa == other.abcisa && ordinati == other.ordinati)
                return true

        }
        return false
    }
    override fun toString(): String {
        return "წერტილის კორდინატები (x;y) ($abcisa;$ordinati)"
    }

     fun Symmetrytox() {
         ordinati = - ordinati
        println("x-ის მიმართ სიმეტრიული წერტილის კორდინატები (x;-y) ($abcisa;$ordinati)")
    }

}
