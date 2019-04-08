package bank.ocr

import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object FactorialKtTest: Spek({
    describe("factorial") {
        it("2! = 2") {
            assertEquals(2, 2.factorial())
        }

        it("3! = 6") {
            assertEquals(6, 3.factorial())
        }

        it("4! = 24") {
            assertEquals(24, 4.factorial())
        }

        it("5! = 120") {
            assertEquals(120, 5.factorial())
        }

        it("10! = 3628800") {
            assertEquals(3628800, 10.factorial())
        }
    }
})