class Dollar(override var amount: Int, override val currency: String = "USD") : Money(amount, currency) {
    override fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier, currency)
    }
}
