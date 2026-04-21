fun main() {
    val str = "Hello World"
    val count = str.count { it.lowercaseChar() in "aeiou" }
    println("Vowels: $count")
}