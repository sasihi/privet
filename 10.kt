fun main() {

    val numbers = intArrayOf(5, 1, 9, 2, 7, 3, 8, 4, 10, 6)


    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }


    println("Сумма четных чисел: $sum")
}
