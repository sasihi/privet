//4. Факториал числа
fun main() {
    print("Введите число: ")
    val number = readLine()!!.toInt()

    var factorial = 1
    for (i in 1..number) {
        factorial *= i
    }
    println("Факториал $number: $factorial")
}