fun main() {
    var f1 = Fraction(2F, 4F)

    val f2 = Fraction(2F, 6F)

    f1.Reduce()
    println(f1)
    f2.Reduce()
    println(f2)

    println(f1.equals(f2))
    println(f1.toString())
    println(f2.toString())


    f1.gamokleba(f2)
    println(f1)

    f1 = Fraction( 2F, 4F)
    f1.division(f2)
    println(f1)

}

class Fraction(n: Float, d: Float) {

    private var numerator: Float = n
    private var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun Reduce(){
        var usg = 1
        var i = 1
        while (i <= numerator && i <= denominator) {
            if (numerator % i == 0F && denominator % i == 0F)
                usg = i
            ++i
            this.numerator /= usg
            this.denominator /= usg
        }
    }

    fun division (gamyofi: Fraction){
        numerator *= gamyofi.denominator
        denominator *= gamyofi.numerator
    }

    private fun Mamravli(toMultiple: Float): Fraction {
        return Fraction(numerator * toMultiple, denominator * toMultiple)
    }


    fun gamokleba(toMinus: Fraction) {
        val f1: Fraction = this.Mamravli(toMinus.denominator)
        val f2: Fraction = toMinus.Mamravli(this.denominator)

        this.numerator = f1.numerator - f2.numerator
        this.denominator = f1.denominator
    }



}

