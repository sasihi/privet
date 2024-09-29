fun main() {
    // Создание арифметической прогрессии
    val firstTerm = 2
    val commonDifference = 3
    val numberOfTerms = 10
    val arithmeticProgression = IntArray(numberOfTerms) { firstTerm + it * commonDifference }

    // Вывод результата
    println("Арифметическая прогрессия: ${arithmeticProgression.contentToString()}")
}