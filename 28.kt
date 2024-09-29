fun main() {
    // Запрос ввода массива от пользователя
    print("Введите числа, разделенные пробелами: ")
    val input = readLine()!! // Получаем ввод и убираем пробелы
    val numbers = input.split(" ").map { it.toInt() }.toIntArray()

    // Вывод массива
    println("Введенный массив: ${numbers.contentToString()}")
}