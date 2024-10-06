fun reverseString(text: String): String {
    return text.reversed()
}

fun main() {
    val text = "Hello world!"
    val reversedText = reverseString(text)
    println("Обратный порядок: $reversedText")
}