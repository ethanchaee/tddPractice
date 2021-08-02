class Dollar(override var amount: Int) : Money(amount) {
    override fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}
