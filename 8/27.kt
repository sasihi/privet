fun containsElement(array: IntArray, element: Int): Boolean {
    for (item in array) {
        if (item == element) {
            return true
        }
    }
    return false
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val element = 3
    val result = containsElement(numbers, element)
    println("Элемент присутствует: $result")
}