fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Удаление элемента 3
    val newArray = removeElement(numbers, 3)

    // Вывод результата
    println("Новый массив: ${newArray.contentToString()}")
}

fun removeElement(array: IntArray, element: Int): IntArray {
    val newArray = array.filter { it != element }.toIntArray()
    return newArray
}