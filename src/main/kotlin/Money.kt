open class Money(open var amount: Int, open val currency: String) : Expression {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Money) {
            return currency == other.currency() && amount == other.amount
        }
        return false
    }

    open fun times(multiplier: Int): Expression {
        return Money(amount * multiplier, currency)
    }

    fun currency() = currency

    override fun toString(): String {
        return "$amount $currency"
    }

    fun plus(addend: Money): Expression = Sum(this, addend)

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount/rate, to)
    }

    companion object {
        fun dollar(amount: Int) = Money(amount, "USD")

        fun franc(amount: Int) = Money(amount, "CHF")
    }
}
