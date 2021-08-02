import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

internal class StockReport : FunSpec({

    test("$5 X 2 = $10") {
        val five = Money.dollar(5)
        five.times(2) shouldBe Money.dollar(10)
    }

    test("Dollar 부작용 - 동치성 적용 이후") {
        val five: Money = Money.dollar(5)
        five.times(2) shouldBe Money.dollar(10)
        five.times(3) shouldBe Money.dollar(15)
    }

    test("CHF 곱셈 계산") {
        val five = Money.franc(5)
        five.times(2).shouldBe(Money.franc(10))
    }

    test("프랑과 달러 비교하기") {
        Money.dollar(5) shouldBe Money.dollar(5)
        Money.dollar(5) shouldNotBe Money.dollar(6)
        Money.dollar(5) shouldNotBe Money.franc(5)
    }

    test("통화 테스트") {
        Money.dollar(1).currency() shouldBe "USD"
        Money.franc(1).currency() shouldBe "CHF"
    }

    test("더하기 $5 + $5 = $10") {
        val five = Money.dollar(5)
        val sum = five.plus(five)
        val bank = Bank()
        val reduced = bank.reduce(sum, "USD")
        reduced shouldBe Money.dollar(10)
    }
})
