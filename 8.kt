fun main() {
    // Создание массива чисел
    val numbers = intArrayOf(5, 1, 9, 2, 7, 3, 8, 4, 10, 6)

    // Поиск элемента 7
    val index = numbers.indexOf(7)

    // Вывод индекса элемента
    if (index != -1) {
        println("Индекс элемента 7: $index")
    } else {
        println("Элемент 7 не найден в массиве.")
    }
}