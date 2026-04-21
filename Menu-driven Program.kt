fun main() {
    val choice = 1
    val a = 10
    val b = 5

    when (choice) {
        1 -> println(a + b)
        2 -> println(a - b)
        3 -> println(a * b)
        4 -> println(a / b)
        else -> println("Invalid choice")
    }
}