fun main() {
    println("Введите число: ")
    val input = readLine() // Считываем строку с консоли

    // Проверяем, удалось ли преобразовать ввод в число
    if (input != null) {
        val number = input.toIntOrNull() // Пытаемся преобразовать строку в целое число
        if (number != null) {
            println("$number — вот какое число Вы ввели")
        } else {
            println("Некорректный ввод")
        }
    } else {
        println("Некорректный ввод")
    }
}
