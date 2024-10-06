fun isDivisibleBy100(number: Int): Boolean {
    return number % 100 == 0
}

fun main() {
    val number = 200
    val result = isDivisibleBy100(number)
    println("Результат: $result")
}