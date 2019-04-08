package bank.ocr

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals


object ValidateListKtTest: Spek({
    describe("validate list") {
        it("illegible") {
            val list = listOf("86110??36")
            val expected = listOf("86110??36 ILL")

            assertEquals(expected, validateList(list))
        }

        it("checksum invalid") {
            val list = listOf("664371495")
            val expected = listOf("664371495 ERR")

            assertEquals(expected, validateList(list))
        }

        it("checksum valid") {
            val list = listOf("457508000")
            val expected = listOf("457508000")

            assertEquals(expected, validateList(list))
        }
    }
})