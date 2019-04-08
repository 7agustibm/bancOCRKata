package bank.ocr

import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SecondPatternPossibilitiesKtTest: Spek({
    describe("second pattern possibilities") {
        it("   ") {
            assertEquals(emptyList<Int>(), secondPatternPossibilities("   "))
        }

        it("  |") {
            assertEquals(listOf(1, 7), secondPatternPossibilities("  |"))
        }

        it(" _|") {
            assertEquals(listOf(2, 3), secondPatternPossibilities(" _|"))
        }

        it("|_|") {
            assertEquals(listOf(4, 8, 9), secondPatternPossibilities("|_|"))
        }

        it("|_ ") {
            assertEquals(listOf(5, 6), secondPatternPossibilities("|_ "))
        }

        it("| |") {
            assertEquals(listOf(0), secondPatternPossibilities("| |"))
        }
    }
})