//Свойства натурального числа:
fun main() {
    print("Введите натуральное число: ")
    val num = readLine()!!.toInt()

    if (num % 2 == 0) {
        println("$num четное число")
    } else {
        println("$num нечетное число")
    }

    if (num % 10 == 7) {
        println("$num оканчивается цифрой 7")
    } else {
        println("$num не оканчивается цифрой 7")
    }
}