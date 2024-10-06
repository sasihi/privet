fun maxArray(numbers: IntArray): Int {
    if (numbers.isEmpty()) {
        return 0
    }
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val max = maxArray(numbers)
    println("Максимальное число: $max")
}