data class List(var data: Int, var nextAddress: List?)

fun main() {
    var list2 = List(2, null)
    var list = List(1, list2)
    println(list.nextAddress?.data)

}
