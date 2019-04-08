package bank.ocr

fun Int.factorial(): Int = IntArray( this ) { it + 1 }.reduce{ acc, i -> acc * i }
