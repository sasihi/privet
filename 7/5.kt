fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    val isEqual = areNumbersEqual(num1, num2)

    println("Числа равны: $isEqual")
}

fun areNumbersEqual(num1: Int, num2: Int): Boolean {
    return num1 == num2
}