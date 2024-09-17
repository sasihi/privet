//Максимальное из трех чисел:
fun main() {
    print("Vvedite pervor chislo; ")
    val a = readLine()!!.toInt()
    print("Vvedite vtoroe chislo; ")
    val b =readLine()!!.toInt()
    print("Vvedite tretie chislo; ")
    val c =readLine()!!.toInt()
    val max = maxOf(a,b,c)
    println("Максимальное число: $max")
}