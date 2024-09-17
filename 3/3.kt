//Вывод оценок по числовым значениям
fun main() {
    print("Введите оценку (от 0 до 10): ")
    val grade = readLine()!!.toInt()

    val gradeDescription = when (grade) {
        in 0..2 -> "Неудовлетворительно"
        in 3..4 -> "Удовлетворительно"
        in 5..6 -> "Хорошо"
        in 7..8 -> "Отлично"
        in 9..10 -> "Превосходно"
        else -> "Неверная оценка"
    }

    println("Оценка: $gradeDescription")
}