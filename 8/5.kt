fun checkCondition(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    val prob = 0.5
    val prize = 100.0
    val pay = 30.0
    val result = checkCondition(prob, prize, pay)
    println("Результат: $result")
}