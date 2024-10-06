fun pyramid(n: Int) {
    for (i in 1..n) {
        val spaces = " ".repeat((n - i))
        val hashes = "#".repeat(i * 2 - 1)
        println("$spaces$hashes$spaces")
    }
}

fun main() {
    pyramid(1)
    pyramid(2)
    pyramid(3)
}