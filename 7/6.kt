import kotlin.random.Random

fun main() {
    var playerScore = 0
    var dealerScore = 0

    // Начало игры
    println("Добро пожаловать в игру 21!")

    // Первоначальная раздача карт
    playerScore += drawCard()
    playerScore += drawCard()
    dealerScore += drawCard()

    println("Ваши карты: $playerScore")
    println("Карта дилера: ${dealerScore / 2}") // Показывает только одну карту дилера

    // Игровая петля игрока
    while (playerScore < 21) {
        println("Взять карту? (y/n)")
        val answer = readLine()!!.toLowerCase()

        if (answer == "y") {
            playerScore += drawCard()
            println("Ваши карты: $playerScore")
        } else {
            break
        }
    }

    // Игровая петля дилера
    while (dealerScore < 17) {
        dealerScore += drawCard()
    }

    // Результат игры
    println("Ваши карты: $playerScore")
    println("Карты дилера: $dealerScore")

    if (playerScore > 21) {
        println("Вы проиграли!")
    } else if (dealerScore > 21) {
        println("Вы выиграли!")
    } else if (playerScore > dealerScore) {
        println("Вы выиграли!")
    } else if (dealerScore > playerScore) {
        println("Вы проиграли!")
    } else {
        println("Ничья!")
    }
}

fun drawCard(): Int {
    return Random.nextInt(1, 11) // Случайное число от 1 до 10
}