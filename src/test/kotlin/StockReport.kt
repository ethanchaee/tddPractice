import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

internal class StockReport : FunSpec({

    test("$5 X 2 = $10") {
        val five = Dollar(5)
        five.times(2) shouldBe Dollar(10)
    }

    test("Dollar 부작용 - 동치성 적용 이후") {
        val five = Dollar(5)
        five.times(2) shouldBe Dollar(10)
        five.times(3) shouldBe Dollar(15)
    }

    test("equals 문제") {
        Dollar(5) shouldBe Dollar(5)
    }

    test("CHF 곱셈 계산") {
        val five = Fran(5)
        five.times(2).shouldBe(Fran(10))
    }

    test("프랑과 달러 비교하기") {
        Dollar(5) shouldBe Dollar(5)
        Dollar(5) shouldNotBe Dollar(6)
        Fran(5) shouldBe Fran(5)
        Fran(5) shouldNotBe Fran(6)
        Dollar(5) shouldNotBe Fran(5)
    }
})
