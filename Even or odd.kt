fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid integer.")
    } else {
        if (number % 2 == 0) {
            println("$number is Even")
        } else {
            println("$number is Odd")
        }
    }
}