class Franc(override var amount: Int, override val currency: String = "CHF") : Money(amount, currency) {
    override fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier, currency)
    }
}
