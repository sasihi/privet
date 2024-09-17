//Национальности
fun main() {
    print("Введите страну (США, Россия, Япония и т.д.): ")
    val country = readLine()!!

    val nationality = when (country) {
        "США" -> "Американец"
        "Россия" -> "Русский"
        "Япония" -> "Японец"
        else -> "Неизвестная национальность"
    }

    println("Национальность: $nationality")
}
