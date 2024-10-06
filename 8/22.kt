fun isPalindrome(text: String): Boolean {
    return text.reversed() == text
}

fun main() {
    val text = "racecar"
    val result = isPalindrome(text)
    println("Палиндром: $result")
}