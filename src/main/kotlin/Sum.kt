class Sum(val augend: Expression, val addend: Expression) : Expression {
    fun plus(addend: Expression) {}

    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}
