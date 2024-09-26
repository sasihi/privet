//17. Вывод символов
fun main() {
    print("Введите строку: ")
    val inputString = readLine()!!

    for (char in inputString) {
        println(char)
    }
}