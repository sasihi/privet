fun calculateFrames(minutes: Int, fps: Int): Int {
    return minutes * 60 * fps
}

fun main() {
    val minutes = 2
    val fps = 30
    val frames = calculateFrames(minutes, fps)
    println("Количество кадров: $frames")
}