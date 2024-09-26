//10. Сумма цифр числа
fun main() {
    print("Введите число: ")
    val number = readLine()!!.toInt()

    var sum = 0
    var temp = number
    while (temp > 0) {
        sum += temp % 10
        temp /= 10
    }
    println("Сумма цифр числа $number: $sum")
}