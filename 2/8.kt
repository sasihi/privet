// Сравнение расстояний:
fun main() {
    print("Введите расстояние в километрах: ")
    val distanceKm = readLine()!!.toDouble()

    print("Введите расстояние в футах: ")
    val distanceFt = readLine()!!.toDouble()

    val distanceM = distanceFt * 0.305 // Перевод футов в метры
    val distanceKmToM = distanceKm * 1000 // Перевод километров в метры

    if (distanceKmToM < distanceM) {
        println("Расстояние в километрах меньше")
    } else {
        println("Расстояние в футах меньше")
    }
}