//6. Вывод таблицы умножения
fun main() {
    for (i in 1..10) {
        for (j in 1..10) {
            print("$i * $j = ${i * j}\t")
        }
        println()
    }
}