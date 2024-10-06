fun caesarCipher(text: String, shift: Int): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val shiftedText = StringBuilder()

    for (char in text.toLowerCase()) {
        if (char in alphabet) {
            val index = alphabet.indexOf(char)
            val shiftedIndex = (index + shift) % alphabet.length
            shiftedText.append(alphabet[shiftedIndex])
        } else {
            shiftedText.append(char)
        }
    }

    return shiftedText.toString()
}

fun main() {
    val text = "Привет мир!"
    val shift = 3

    val encryptedText = caesarCipher(text, shift)
    println("Зашифрованный текст: $encryptedText")

    val decryptedText = caesarCipher(encryptedText, -shift)
    println("Расшифрованный текст: $decryptedText")
}