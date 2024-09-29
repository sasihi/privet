fun main() {

    val numbers = intArrayOf(5, 1, 9, 2, 7, 3, 8, 4, 10, 6)


    val newNumbers = numbers.copyOf()


    println("Новый массив: ${newNumbers.contentToString()}")
}
