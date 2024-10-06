fun sumOfFirstN(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    val n = 5
    val result = sumOfFirstN(n)
    println("Сумма первых $n натуральных чисел: $result")
}