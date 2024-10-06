fun countVowels(text: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in text.toLowerCase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

fun main() {
    val text = "Hello world!"
    val vowelCount = countVowels(text)
    println("Количество гласных: $vowelCount")
}