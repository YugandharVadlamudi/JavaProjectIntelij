class Node(val data: Int, val next: Node?){

}

fun main() {

    var head: Node? = null
    var tail: Node? = null
    val node = Node(1, head)
    head = node
    tail=node
    val node2 = Node(2, tail)
    head = node2
    var current = head

    while (current != null) {
        println("${current.data}")
        current = current.next
    }

}