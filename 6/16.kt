fun main() {
    // Создание массивов
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)

    // Соединение массивов
    val concatenatedArray = array1 + array2

    // Вывод результата
    println("Соединенный массив: ${concatenatedArray.contentToString()}")
}