fun main() {
    // Создание отсортированных массивов
    val array1 = intArrayOf(1, 3, 5, 7, 9)
    val array2 = intArrayOf(2, 4, 6, 8, 10)

    // Слияние массивов
    val mergedArray = array1.plus(array2).sortedArray()

    // Вывод результата
    println("Слитый массив: ${mergedArray.contentToString()}")
}