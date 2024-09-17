import kotlin.math.E // Импортируем константу E

fun main() {
    // Форматируем число E с точностью до десятых
    val formattedE = String.format("%.1f", E)

    // Выводим результат
    println("Число e с точностью до десятых: $formattedE")
}
