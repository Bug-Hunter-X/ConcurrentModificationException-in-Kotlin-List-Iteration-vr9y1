fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]
    //This is incorrect as it modifies the list during iteration
    for (i in list.indices) {
        if (list[i] == 2) {
            list.removeAt(i)
            break // added break to avoid ConcurrentModificationException
        }
    }
    println(list) //Output: [1]
}