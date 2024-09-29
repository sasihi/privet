fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Сумма и произведение
    var sum = 0
    var product = 1
    for (number in numbers) {
        sum += number
        product *= number
    }

    // Вывод результата
    println("Сумма: $sum")
    println("Произведение: $product")
}