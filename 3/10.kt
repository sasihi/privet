//Способы оплаты
fun main() {
    print("Введите способ оплаты (наличные, кредитная карта, листья): ")
    val paymentMethod = readLine()!!

    when (paymentMethod) {
        "наличные" -> println("Оплата наличными.")
        "кредитная карта" -> println("Оплата кредитной картой.")
        "листья" -> println("Оплата листиками.")
        else -> println("Неверный способ оплаты.")
    }
}