fun reverseArray(array: IntArray): IntArray {
    return array.reversedArray()
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val reversedNumbers = reverseArray(numbers)
    println("Перевернутый массив: ${reversedNumbers.joinToString(", ")}")
}