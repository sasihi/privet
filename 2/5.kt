//Существование треугольника:
fun main() {
    print("Введите длину первой стороны: ")
    val side1 = readLine()!!.toInt()

    print("Введите длину второй стороны: ")
    val side2 = readLine()!!.toInt()

    print("Введите длину третьей стороны: ")
    val side3 = readLine()!!.toInt()

    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        println("Треугольник с такими сторонами существует")
    } else {
        println("Треугольник с такими сторонами не существует")
    }
}