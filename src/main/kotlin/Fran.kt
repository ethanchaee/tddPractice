data class Fran(override var amount: Int) : Money(amount) {
    fun times(multiplier: Int): Fran {
        return Fran(amount * multiplier)
    }
}
