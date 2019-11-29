class ThreadExample:Runnable {
    override fun run() {
        for (i in 1..10) {
            println("${i}")
        }
    }


}
fun main() {
    val thread = Thread(ThreadExample())
    thread.start()
    thread.start()

}