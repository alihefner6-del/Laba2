fun main() {
    print("Enter total seconds: ")
    val totalSeconds = readln().toInt()
    val hours = totalSeconds / 3600
    val remainingSeconds = totalSeconds % 3600
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60
    println("H:M:S -> $hours:$minutes:$seconds")
}