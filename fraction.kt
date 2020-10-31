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


   println(f1.gamokleba(f2))

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

    fun gamokleba(minus: Fraction): Fraction{
        return Fraction(numerator*minus.denominator-minus.numerator*denominator,denominator*minus.denominator)
    }


}
