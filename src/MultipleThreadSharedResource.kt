import kotlin.concurrent.thread

class SharedResources {
    var sharedResources: Int=0
    fun startTwoThreads() {
        val thread1=Thread(object : Runnable {
            override fun run() {
                synchronized(this){sharedResources++}
                println("Thread 1 start ${sharedResources}")
            }
        })
        val thread2=Thread(object : Runnable {
            override fun run() {
                sharedResources--
                println("Thread 2 start ${sharedResources}")
            }
        })
        thread1.start()
        thread2.start()
    }
}
fun main() {
    val sharedResources = SharedResources()
    sharedResources.startTwoThreads()

}