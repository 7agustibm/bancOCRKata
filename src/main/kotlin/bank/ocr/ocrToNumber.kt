package bank.ocr

import arrow.core.Option

fun <T> List<T>.toOption(): Option<T> = Option.fromNullable(this.firstOrNull())

fun ocrToNumber(value: String): Option<Int> = value.split("\n")
    .mapIndexed { index, pattern ->
        when (index) {
            0 -> firstPatternPossibilities(pattern)
            1 -> secondPatternPossibilities(pattern)
            2 -> thirdPatternPossibilities(pattern)
            else -> listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        }
    }
    .reduce { result, list -> result.intersect(list.asIterable()).toList() }
    .toOption()