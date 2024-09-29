fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Нахождение среднего арифметического
    val average = calculateAverage(numbers)

    // Вывод результата
    println("Среднее арифметическое: $average")
}

fun calculateAverage(array: IntArray): Double {
    if (array.isEmpty()) {
        return 0.0
    }

    var sum = 0
    for (number in array) {
        sum += number
    }
    return sum.toDouble() / array.size
}