// Нечетное число из двух:
fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()

    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    if (num1 % 2 == 0 && num2 % 2 != 0) {
        println("Нечетное число: $num2")
    } else if (num1 % 2 != 0 && num2 % 2 == 0) {
        println("Нечетное число: $num1")
    } else {
        println("Ошибка: числа должны быть разной четности")
    }
}