package bank.ocr

fun thirdPatternPossibilities(pattern: String): List<Int> =
    when (pattern) {
        "  |" -> listOf(1, 4, 7)
        " _|" -> listOf(3, 5, 9)
        "|_|" -> listOf(0, 6, 8)
        "|_ " -> listOf(2)
        else -> emptyList()
    }