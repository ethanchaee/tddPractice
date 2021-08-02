class Franc(override var amount: Int, override val currency: String = "CHF") : Money(amount, currency)
