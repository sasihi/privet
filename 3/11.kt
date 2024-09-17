//Группа крови
fun main() {
    print("Введите группу крови (A, B, AB, O): ")
    val bloodType = readLine()!!

    val compatibleTypes = when (bloodType) {
        "A" -> listOf("A", "O")
        "B" -> listOf("B", "O")
        "AB" -> listOf("A", "B", "AB", "O")
        "O" -> listOf("O")
        else -> listOf("Неверная группа крови")
    }

    if (compatibleTypes.size == 1 && compatibleTypes[0] == "Неверная группа крови") {
        println(compatibleTypes[0])
    } else {
        println("Совместимые типы крови: ${compatibleTypes.joinToString(", ")}")
    }
}