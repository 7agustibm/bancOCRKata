package bank.ocr

import arrow.core.None
import arrow.core.Some
import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object OcrToNumberKtTest: Spek({
    describe("ocr to number") {
        it("1") {
            val value = "   \n  |\n  |\n   "
            assertEquals(Some(1), ocrToNumber(value))
        }

        it("2") {
            val value = " _ \n _|\n|_ \n   "
            assertEquals(Some(2), ocrToNumber(value))
        }

        it("3") {
            val value = " _ \n _|\n _|\n   "
            assertEquals(Some(3), ocrToNumber(value))
        }

        it("4") {
            val value = "   \n|_|\n  |\n   "
            assertEquals(Some(4), ocrToNumber(value))
        }

        it("5") {
            val value = " _ \n|_ \n _|\n   "
            assertEquals(Some(5), ocrToNumber(value))
        }

        it("6") {
            val value = " _ \n|_ \n|_|\n   "
            assertEquals(Some(6), ocrToNumber(value))
        }

        it("7") {
            val value = " _ \n  |\n  |\n   "
            assertEquals(Some(7), ocrToNumber(value))
        }

        it("8") {
            val value = " _ \n|_|\n|_|\n   "
            assertEquals(Some(8), ocrToNumber(value))
        }

        it("9") {
            val value = " _ \n|_|\n _|\n   "
            assertEquals(Some(9), ocrToNumber(value))
        }

        describe("errors") {

            it("error not second pattern") {
                val value = "   \n   \n  |\n   "
                assertTrue(ocrToNumber(value) is None)
            }

            it("error not third pattern") {
                val value = "   \n  |\n   \n   "
                assertTrue(ocrToNumber(value) is None)
            }
        }
    }
})