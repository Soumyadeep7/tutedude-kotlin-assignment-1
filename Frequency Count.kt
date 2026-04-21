fun main() {
    val list = listOf(1, 2, 2, 3, 3, 3)
    val freq = list.groupingBy { it }.eachCount()
    println(freq)
}