class Fran(private var amount: Int) {
    fun times(multiplier: Int): Fran {
        return Fran(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return (other as? Fran)?.amount == amount ?: false
    }
}
