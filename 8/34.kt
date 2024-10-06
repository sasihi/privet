fun removeSpaces(text: String): String {
    return text.replace(" ", "")
}

fun main() {
    val text = "Hello world!"
    val result = removeSpaces(text)
    println("Строка без пробелов: $result")
}