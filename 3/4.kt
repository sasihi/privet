//Определение времени суток
fun main() {
    print("Введите время в часах (от 0 до 23): ")
    val hour = readLine()!!.toInt()

    val timeOfDay = when (hour) {
        in 0..5 -> "Ночь"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..23 -> "Вечер"
        else -> "Неверное время"
    }

    println("Время суток: $timeOfDay")
}