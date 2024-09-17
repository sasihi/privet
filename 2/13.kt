//Свойства четырехзначного числа:
fun main() {
    print("Введите четырехзначное число: ")
    val num = readLine()!!.toInt()

    val firstDigit = num / 1000 // Получение первой цифры
    val secondDigit = (num % 1000) / 100 // Получение второй цифры
    val thirdDigit = (num % 100) / 10 // Получение третьей цифры
    val fourthDigit = num % 10 // Получение четвертой цифры

    val sumFirstTwo = firstDigit + secondDigit
    val sumLastTwo = thirdDigit + fourthDigit

    println("Сумма первых двух цифр: $sumFirstTwo")
    println("Сумма последних двух цифр: $sumLastTwo")

    if (sumFirstTwo == sumLastTwo) {
        println("Суммы двух первых и двух последних цифр равны")
    } else {
        println("Суммы двух первых и двух последних цифр не равны")
    }

    val sumAllDigits = firstDigit + secondDigit + thirdDigit + fourthDigit
    if (sumAllDigits % 3 == 0) {
        println("Сумма цифр кратна трем")
    } else {
        println("Сумма цифр не кратна трем")
    }

    val productAllDigits = firstDigit * secondDigit * thirdDigit * fourthDigit
    if (productAllDigits % 4 == 0) {
        println("Произведение цифр кратно четырем")
    } else {
        println("Произведение цифр не кратно четырем")
    }

    print("Введите число a: ")
    val a = readLine()!!.toInt()
    if (productAllDigits % a == 0) {
        println("Произведение цифр кратно $a")
    } else {
        println("Произведение цифр не кратно $a")
    }
}