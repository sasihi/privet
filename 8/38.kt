fun stringLength(text: String): Int {
    return text.length
}

fun main() {
    val text = "Hello world!"
    val length = stringLength(text)
    println("Длина строки: $length")
}