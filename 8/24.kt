fun toUpperCase(text: String): String {
    return text.uppercase()
}

fun main() {
    val text = "hello world!"
    val upperText = toUpperCase(text)
    println("Текст в верхнем регистре: $upperText")
}