fun main() {
    // Создание массива из 20 элементов
    val numbers = IntArray(20)

    // Заполнение массива случайными числами от 1 до 100
    for (i in numbers.indices) {
        numbers[i] = (1..100).random()
    }

    // Вывод результата
    println("Массив случайных чисел: ${numbers.contentToString()}")
}