fun main() {
    val marks = 85

    val grade = when {
        marks >= 90 -> "A"
        marks >= 75 -> "B"
        marks >= 60 -> "C"
        else -> "D"
    }

    println("Grade: $grade")
}