package bank.ocr

import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ThirdPatternPossibilitiesKtTest: Spek({
    describe("third pattern possibilities") {
        it("   ") {
            assertEquals(emptyList<Int>(), thirdPatternPossibilities("   "))
        }

        it("  |") {
            assertEquals(listOf(1, 4, 7), thirdPatternPossibilities("  |"))
        }

        it(" _|") {
            assertEquals(listOf(3, 5, 9), thirdPatternPossibilities(" _|"))
        }

        it("|_|") {
            assertEquals(listOf(0, 6, 8), thirdPatternPossibilities("|_|"))
        }

        it("|_ ") {
            assertEquals(listOf(2), thirdPatternPossibilities("|_ "))
        }
    }
})