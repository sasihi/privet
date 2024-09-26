//12. Числовая последовательность
fun main() {
    print("Введите начальное число: ")
    val startNumber = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()

    print("Числовая последовательность: ")
    for (i in 0..10) { // Выведем 10 чисел последовательности
        val number = startNumber + step * i
        print("$number ")
    }
}