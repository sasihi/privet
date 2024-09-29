fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 5, 3, 9, 2, 7, 4, 8, 6, 10)

    // Нахождение второго по величине элемента
    val secondMax = findSecondMax(numbers)

    // Вывод результата
    if (secondMax != null) {
        println("Второй по величине элемент: $secondMax")
    } else {
        println("Массив слишком мал для поиска второго по величине элемента.")
    }
}

fun findSecondMax(array: IntArray): Int? {
    if (array.size < 2) {
        return null
    }

    var max = array[0]
    var secondMax: Int? = null

    for (i in 1 until array.size) {
        if (array[i] > max) {
            secondMax = max
            max = array[i]
        } else if (array[i] < max && (secondMax == null || array[i] > secondMax)) {
            secondMax = array[i]
        }
    }

    return secondMax
}