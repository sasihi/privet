fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 1, 2, 2, 2, 3, 3, 3, 3, 1, 1, 1, 1)

    // Нахождение максимальной последовательности
    val maxSequence = findMaxSequence(numbers)

    // Вывод результата
    println("Максимальная последовательность: ${maxSequence.joinToString(", ")}")
}

fun findMaxSequence(array: IntArray): List<Int> {
    if (array.isEmpty()) {
        return emptyList()
    }

    var currentSequence = mutableListOf(array[0])
    var maxSequence = currentSequence

    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentSequence.add(array[i])
        } else {
            currentSequence = mutableListOf(array[i])
        }

        if (currentSequence.size > maxSequence.size) {
            maxSequence = currentSequence
        }
    }

    return maxSequence
}