//Високосный год:
fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()

    val isLeapYear = when {
        year % 4 != 0 -> false
        year % 100 == 0 && year % 400 != 0 -> false
        else -> true
    }

    val daysInYear = if (isLeapYear) 366 else 365

    println("Год $year ${if (isLeapYear) "високосный" else "не високосный"}, в нем $daysInYear дней.")
}