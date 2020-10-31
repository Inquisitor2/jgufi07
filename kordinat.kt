fun main(){
    val p1 = Point(5F, 10F)

    val p2 = Point(5F, 10F)
    println(p1==p2)

    println(p1.toString())
    println(p1)
    println(p1.Symmetrytox())

}
interface IFigure {
    fun Symmetrytox(): String

}

class Point(x: Float, y: Float):IFigure {

    private val abcisa: Float = x
    private val ordinati: Float = y

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

    override fun Symmetrytox(): String {
        return "x-ის მიმართ სიმეტრიული წერტილის კორდინატები (-x;y) ($abcisa;-$ordinati)"
    }

}
