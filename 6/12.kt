fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Перестановка элементов 1 и 3
    swap(numbers, 0, 2)

    // Вывод результата
    println("Переставленный массив: ${numbers.contentToString()}")
}

fun swap(array: IntArray, index1: Int, index2: Int) {
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}