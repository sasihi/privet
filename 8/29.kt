fun findMinMax(numbers: IntArray): Pair<Int, Int> {
    if (numbers.isEmpty()) {
        return Pair(0, 0)
    }
    var max = numbers[0]
    var min = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }
    }
    return Pair(max, min)
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val (max, min) = findMinMax(numbers)
    println("Максимум: $max, Минимум: $min")
}