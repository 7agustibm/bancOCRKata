package bank.ocr

import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object FirstPatternPossibilitiesKtTest: Spek({
    describe("first pattern possibilities") {
        it("first pattern is blank") {
            assertEquals(listOf(1, 4), firstPatternPossibilities("   "))
        }

        it("first pattern is blank") {
            assertEquals(listOf(0, 2, 3, 5, 6, 7, 8, 9), firstPatternPossibilities(" _ "))
        }

        it("pattern not exist") {
            assertEquals(emptyList<Int>(), firstPatternPossibilities("  |"))
        }
    }
})