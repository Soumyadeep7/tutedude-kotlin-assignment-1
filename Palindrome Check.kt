fun isPalindrome(n: Int): Boolean {
    return n.toString() == n.toString().reversed()
}

fun main() {
    println(isPalindrome(121))
}