package bank.ocr

import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ChecksumKtTest: Spek({
    describe("checksum") {
        it("valid") {
            val validNumber = listOf(3, 4, 5, 8, 8, 2, 8, 6 ,5)
            assertTrue(checksum(validNumber))
        }

        it("invalid") {
            val invalidNumber = listOf(2, 4, 5, 8, 8, 2, 8, 6 ,5)
            assertFalse(checksum(invalidNumber))
        }

        it("immutable") {
            val validNumber = listOf(3, 4, 5, 8, 8, 2, 8, 6 ,5)
            val copy = listOf(*validNumber.toTypedArray())
            checksum(validNumber)
            assertEquals(copy, validNumber)
        }
    }
})