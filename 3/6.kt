//Угадай число
fun main() {
    val secretNumber = (1..100).random()
    var attempts = 0

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте угадать.")

    do {
        print("Введите ваше число: ")
        val guess = readLine()!!.toInt()
        attempts++

        when {
            guess < secretNumber -> println("Загаданное число больше")
            guess > secretNumber -> println("Загаданное число меньше")
            else -> {
                println("Поздравляю! Вы угадали число за $attempts попыток!")
                break
            }
        }
    } while (true)
}