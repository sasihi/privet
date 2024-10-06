fun sumArray(numbers: IntArray): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val sum = sumArray(numbers)
    println("Сумма элементов массива: $sum")
}