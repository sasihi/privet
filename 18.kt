fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    // Группировка по 5 элементов
    for (i in 0 until numbers.size step 5) {
        val group = numbers.slice(i until i + 5)
        println("Группа ${i / 5 + 1}: ${group.joinToString(", ")}")
    }
}