fun sortArray(numbers: IntArray): IntArray {
    return numbers.sortedArray()
}

fun main() {
    val numbers = intArrayOf(5, 2, 4, 1, 3)
    val sortedNumbers = sortArray(numbers)
    println("Отсортированный массив: ${sortedNumbers.joinToString(", ")}")
}