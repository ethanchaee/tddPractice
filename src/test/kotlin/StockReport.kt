import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class StockReport : FunSpec({

    test("$5 X 2 = $10") {
        val five = Dollar(5)
        five.times(2)
        five.amount shouldBe 10
    }

    test("Dollar 부작용") {
        val five = Dollar(5)
        var product = five.times(2)
        product.amount shouldBe 10
        product = five.times(3)
        product.amount shouldBe 15
    }
})
