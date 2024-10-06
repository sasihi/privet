fun factorial(number: Int): Long {
    if (number == 0) {
        return 1
    } else {
        return number * factorial(number - 1)
    }
}

fun main() {
    val number = 5
    val result = factorial(number)
    println("Факториал: $result")
}