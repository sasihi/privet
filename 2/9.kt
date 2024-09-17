//Деление нацело:
fun main() {
    print("Введите число m: ")
    val m = readLine()!!.toInt()

    print("Введите число n: ")
    val n = readLine()!!.toInt()

    if (m % n == 0) {
        val quotient = m / n
        println("Частное от деления: $quotient")
    } else {
        println("m на n нацело не делится")
    }
}