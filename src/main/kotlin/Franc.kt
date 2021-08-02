class Franc(override var amount: Int) : Money(amount) {
    override fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}
