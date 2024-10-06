fun repetition(txt: String, n: Int): String {
    if (n == 0) {
        return ""
    } else {
        return txt + repetition(txt, n - 1)
    }
}

fun main() {
    println(repetition("ab", 3)) // "ababab"
    println(repetition("kiwi", 1)) // "kiwi"
    println(repetition("cherry", 2)) // "cherrycherry"
}