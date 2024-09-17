//Определение времени приготовления по типу пищи
fun main() {
    print("Введите тип пищи (суп, картошка, мясо, рыба): ")
    val foodType = readLine()!!

    val cookingTime = when (foodType) {
        "суп" -> 30
        "картошка" -> 20
        "мясо" -> 60
        "рыба" -> 25
        else -> -1
    }

    if (cookingTime == -1) {
        println("Неизвестный тип пищи")
    } else {
        println("Время приготовления: $cookingTime минут")
    }
}