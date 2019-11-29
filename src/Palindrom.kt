class Palindrom {
    fun isPalinDrome(number:Int) {
        var num=number
        while(num>0) {
            println("Palindrom.isPalinDrome${num % 10}")
            num %= 10
        }
    }
}

fun main() {
    val palindrom = Palindrom()
    palindrom.isPalinDrome(453)
}