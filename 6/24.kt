fun main() {
    // Создание матрицы
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Транспонирование матрицы
    val transposedMatrix = transposeMatrix(matrix)

    // Вывод результата
    println("Транспонированная матрица:")
    for (row in transposedMatrix) {
        println(row.contentToString())
    }
}

fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val cols = matrix[0].size

    val transposedMatrix = Array(cols) { IntArray(rows) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}