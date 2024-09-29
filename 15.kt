fun main() {
    // Создание массива
    val numbers = intArrayOf(1, 2, 3, 2, 1)

    // Проверка на палиндром
    val isPalindrome = numbers.contentEquals(numbers.reversedArray())

    // Вывод результата
    if (isPalindrome) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}