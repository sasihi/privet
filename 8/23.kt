fun countCharacters(text: String): Int {
    return text.length
}

fun main() {
    val text = "Hello world!"
    val count = countCharacters(text)
    println("Количество символов: $count")
}