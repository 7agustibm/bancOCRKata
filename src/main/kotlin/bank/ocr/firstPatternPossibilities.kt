package bank.ocr

fun firstPatternPossibilities(pattern: String): List<Int> =
    when (pattern) {
        "   " -> listOf(1, 4)
        " _ " -> listOf(0, 2, 3, 5, 6, 7, 8, 9)
        else -> emptyList()
    }