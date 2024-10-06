fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val number = 6
    val result = isEven(number)
    println("Четное: $result")
}