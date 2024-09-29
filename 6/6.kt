fun main() {

    val numbers = intArrayOf(5, 1, 9, 2, 7, 3, 8, 4, 10, 6)


    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()


    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }


    println("Четные числа: ${evenNumbers.joinToString(", ")}")
    println("Нечетные числа: ${oddNumbers.joinToString(", ")}")
}