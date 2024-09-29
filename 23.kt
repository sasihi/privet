fun main() {
    // Создание массивов
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val array3 = intArrayOf(7, 8, 9)

    // Объединение массивов
    val mergedArray = mergeArrays(array1, array2, array3)

    // Вывод результата
    println("Объединенный массив: ${mergedArray.contentToString()}")
}

fun mergeArrays(vararg arrays: IntArray): IntArray {
    val mergedArray = arrays.flatMap { it.toList() }.toIntArray()
    return mergedArray
}