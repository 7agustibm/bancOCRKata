package bank.ocr

fun secondPatternPossibilities(pattern: String): List<Int> =
    when (pattern) {
        "  |" -> listOf(1, 7)
        " _|" -> listOf(2, 3)
        "|_|" -> listOf(4, 8, 9)
        "|_ " -> listOf(5, 6)
        "| |" -> listOf(0)
        else -> emptyList()
    }
