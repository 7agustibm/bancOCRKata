package bank.ocr

fun Int.isModule(module: Int): Boolean = this % module == 0

fun checksum(number: List<Int>): Boolean = number
    .reversed()
    .reduceIndexed { index, accumulate, value -> accumulate + (value * (index + 1)) }
    .isModule(11)

fun List<Int>.isValidChecksum (): Boolean = bank.ocr.checksum(this)
