fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите оператор (+, -, *, /):")
    val operator = readLine()!!

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    var result = 0.0

    when (operator) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль невозможно!")
            } else {
                result = num1 / num2
            }
        }
        else -> println("Неверный оператор!")
    }

    if (result != 0.0) {
        println("$num1 $operator $num2 = $result")
    }
}