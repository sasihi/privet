fun main() {

    val numbers = intArrayOf(5, 1, 9, 2, 7, 3, 8, 4, 10, 6, 5, 2, 1)


    val uniqueNumbers = numbers.distinct().toTypedArray()


    println("Уникальные элементы: ${uniqueNumbers.contentToString()}")
}