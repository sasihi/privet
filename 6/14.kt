fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Нахождение чисел, делящихся на 3
    val divisibleBy3 = numbers.filter { it % 3 == 0 }

    // Вывод результата
    println("Числа, делящиеся на 3: ${divisibleBy3.joinToString(", ")}")
}