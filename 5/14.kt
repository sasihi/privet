//14. Генерация случайных чисел
fun main() {
    println("10 случайных чисел от 1 до 100:")
    for (i in 1..10) {
        val randomNumber = (1..100).random()
        println(randomNumber)
    }
}