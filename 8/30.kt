fun sumNumbers(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    val n = 5
    val sum = sumNumbers(n)
    println("Сумма чисел: $sum")
}