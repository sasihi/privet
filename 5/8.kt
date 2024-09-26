//8. Наибольший общий делитель (НОД)
fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    val gcd = gcd(num1, num2)
    println("НОД $num1 и $num2: $gcd")
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}