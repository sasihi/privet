fun combineStrings(str1: String, str2: String): String {
    return str1 + str2
}

fun main() {
    val str1 = "Hello"
    val str2 = " world!"
    val combinedString = combineStrings(str1, str2)
    println("Объединенная строка: $combinedString")
}