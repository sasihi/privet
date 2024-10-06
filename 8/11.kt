fun equation(equation: String): Int {
    val parts = equation.split("+", "-", "*", "/")
    var result = parts[0].toInt()
    for (i in 1 until parts.size) {
        when (equation[parts[i - 1].length + i - 1]) {
            '+' -> result += parts[i].toInt()
            '-' -> result -= parts[i].toInt()
            '*' -> result *= parts[i].toInt()
            '/' -> result /= parts[i].toInt()
        }
    }
    return result
}

fun main() {
    println(equation("1+1")) // 2
    println(equation("7*4-2")) // 26
    println(equation("1+1+1+1+1")) // 5
}