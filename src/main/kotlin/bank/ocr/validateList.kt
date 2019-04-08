package bank.ocr

fun validateList(numbers: List<String>): List<String> =
    numbers.map { if(it.contains("?")) """$it ILL""" else validate(it)  }

fun String.toListInt() = this.split("").filter { it != "" }.map { it.toInt() }

fun validate(number: String): String = when {
    number.toListInt().isValidChecksum() -> number
    else -> """$number ERR"""
}