fun main() {

    val numbers = intArrayOf(5, 1, 9, 2, 7, 3, 8, 4, 10, 6)


    val max = numbers.maxOrNull() ?: 0 // Если массив пустой, возвращаем 0
    val min = numbers.minOrNull() ?: 0


    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}