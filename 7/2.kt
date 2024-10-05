
//PALINDROM
fun main() {
    println("Введите слово:")
    val word = readLine()!!.toLowerCase()

    if (word == word.reversed()) {
        println("$word - палиндром")
    } else {
        println("$word - не палиндром")
    }
}