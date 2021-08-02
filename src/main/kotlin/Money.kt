abstract class Money(open var amount: Int, open val currency: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Money) {
            return javaClass == other.javaClass && amount == other.amount
        }
        return false
    }

    abstract fun times(multiplier: Int): Money

    fun currency() = currency

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }
        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }

}
