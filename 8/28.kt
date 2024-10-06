fun createArray(n: Int): IntArray {
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = i + 1
    }
    return array
}

fun main() {
    val n = 5
    val array = createArray(n)
    println("Массив: ${array.joinToString(", ")}")
}