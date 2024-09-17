//Тип треугольника по длинам сторон
fun main() {
    print("Введите длину первой стороны: ")
    val side1 = readLine()!!.toInt()

    print("Введите длину второй стороны: ")
    val side2 = readLine()!!.toInt()

    print("Введите длину третьей стороны: ")
    val side3 = readLine()!!.toInt()

    val triangleType = when {
        side1 == side2 && side1 == side3 -> "Равносторонний треугольник"
        side1 == side2 || side1 == side3 || side2 == side3 -> "Равнобедренный треугольник"
        else -> "Разносторонний треугольник"
    }

    println("Тип треугольника: $triangleType")
}