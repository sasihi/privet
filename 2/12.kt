//Свойства двузначного числа:
fun main() {
    print("Введите двузначное число: ")
    val num = readLine()!!.toInt()

    val firstDigit = num / 10 // Получение первой цифры
    val secondDigit = num % 10 // Получение второй цифры

    if (firstDigit > secondDigit) {
        println("Первая цифра больше")
    } else if (firstDigit < secondDigit) {
        println("Вторая цифра больше")
    } else {
        println("Цифры одинаковы")
    }
}