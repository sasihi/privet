//19. Сортировка списка
fun main() {
    val numbers = intArrayOf(25, 12, 36, 8, 54)

    println("Список перед сортировкой: ${numbers.joinToString(", ")}")
    for (i in 0 until numbers.size - 1) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] > numbers[j]) {
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }
    println("Список после сортировки: ${numbers.joinToString(", ")}")
}