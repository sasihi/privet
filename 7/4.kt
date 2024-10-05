fun main() {
    println("Введите числа через пробел:")
    val numbers = readLine()!!.split(" ").map { it.toInt() }

    val minNumber = findMinNumber(numbers)

    println("Самое маленькое число: $minNumber")
}

fun findMinNumber(numbers: List<Int>): Int {
    return numbers.minOrNull()!!
}