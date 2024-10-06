fun lastElement(array: IntArray): Int {
    if (array.isEmpty()) {
        return 0
    }
    return array[array.size - 1]
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val last = lastElement(numbers)
    println("Последний элемент: $last")
}