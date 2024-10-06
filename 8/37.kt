fun printMultiplicationTable(number: Int) {
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}

fun main() {
    val number = 7
    printMultiplicationTable(number)
}