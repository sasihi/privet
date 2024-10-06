fun differenceMinMax(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        return 0
    }
    val max = numbers.maxOrNull()!!
    val min = numbers.minOrNull()!!
    return max - min
}

fun main() {
    val numbers = listOf(10, 5, 20, 15)
    val difference = differenceMinMax(numbers)
    println("Разность максимального и минимального: $difference")
}