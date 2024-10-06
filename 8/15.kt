fun max(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}

fun main() {
    val num1 = 10
    val num2 = 5
    val maxNumber = max(num1, num2)
    println("Максимальное число: $maxNumber")
}