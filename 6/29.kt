fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 3, 5, 2, 4)

    // Нахождение медианы
    val median = findMedian(numbers)

    // Вывод результата
    println("Медиана: $median")
}

fun findMedian(array: IntArray): Double {
    if (array.isEmpty()) {
        return 0.0
    }

    val sortedArray = array.sortedArray()
    val middleIndex = sortedArray.size / 2

    return if (sortedArray.size % 2 == 0) {
        (sortedArray[middleIndex - 1] + sortedArray[middleIndex]).toDouble() / 2
    } else {
        sortedArray[middleIndex].toDouble()
    }
}