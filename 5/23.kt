//23. Сложение и умножение
fun main() {
    println("Введите две цифры или введите 'стоп' для выхода.")
    while (true) {
        print("Введите первую цифру: ")
        val input1 = readLine()
        if (input1 == "стоп") break
        val num1 = input1!!.toInt()

        print("Введите вторую цифру: ")
        val input2 = readLine()
        if (input2 == "стоп") break
        val num2 = input2!!.toInt()

        println("Выберите операцию (+ или *):")
        val operation = readLine()!!

        when (operation) {
            "+" -> println("$num1 + $num2 = ${num1 + num2}")
            "*" -> println("$num1 * $num2 = ${num1 * num2}")
            else -> println("Неверная операция.")
        }
    }
}