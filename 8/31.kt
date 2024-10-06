fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun main() {
    val celsius = 25.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("Температура по Фаренгейту: $fahrenheit")
}