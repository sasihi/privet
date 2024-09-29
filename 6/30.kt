fun main() {
    // Создание массива
    val numbers = IntArray(100) { (1..100).random() }

    // Распределение по группам
    val groups = mutableListOf<List<Int>>()
    for (i in 0..9) {
        val group = numbers.slice((i * 10) until (i * 10 + 10))
        groups.add(group)
    }

    // Вывод результата
    for (i in groups.indices) {
        println("Группа ${i + 1}: ${groups[i].joinToString(", ")}")
    }
}