package bank.ocr

import arrow.core.None
import arrow.core.Some
import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object NumberOcrToStringKtTest: Spek({
    describe("number ocr to string") {
        it("happy path") {
            val numbers = listOf(Some(1))
            assertEquals("1", numberOcrToString(numbers))
        }

        it("error value") {
            val numbers = listOf(None)
            assertEquals("?", numberOcrToString(numbers))
        }
    }
})