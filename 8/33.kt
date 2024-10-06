fun findElementByIndex(array: IntArray, index: Int): Int {
    if (index < 0 || index >= array.size) {
        return 0
    }
    return array[index]
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val index = 2
    val element = findElementByIndex(numbers, index)
    println("Элемент по индексу: $element")
}