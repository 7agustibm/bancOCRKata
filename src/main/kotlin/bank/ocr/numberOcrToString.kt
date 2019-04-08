package bank.ocr

import arrow.core.Option
import arrow.core.getOrElse

fun Option<Int>.mapToString(): Option<String> = this.map { value -> value.toString() }

fun numberOcrToString(numbers: List<Option<Int>>): String =
    numbers
        .map { it.mapToString() }
        .map { it.getOrElse { "?" } }
        .reduce { acc, value -> acc + value }
