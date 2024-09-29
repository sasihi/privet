fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Линейный поиск элемента 3
    val found = linearSearch(numbers, 3)

    // Вывод результата
    if (found) {
        println("Элемент найден.")
    } else {
        println("Элемент не найден.")
    }
}

fun linearSearch(array: IntArray, element: Int): Boolean {
    for (number in array) {
        if (number == element) {
            return true
        }
    }
    return false
}