//15. Проверка палиндрома
fun main() {
    print("Введите строку: ")
    val inputString = readLine()!!

    if (isPalindrome(inputString)) {
        println("$inputString - палиндром")
    } else {
        println("$inputString - не палиндром")
    }
}

fun isPalindrome(str: String): Boolean {
    return str.reversed() == str
}