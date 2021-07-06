import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class StockReport : FunSpec({

    test("통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻음") {
        val dollar = Dollar(5)
        dollar.times(2)

        dollar.amount shouldBe 10
    }
})
