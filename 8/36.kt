fun containsSubstring(text: String, substring: String): Boolean {
    return text.contains(substring)
}

fun main() {
    val text = "Hello world!"
    val substring = "world"
    val result = containsSubstring(text, substring)
    println("Содержит подстроку: $result")
}