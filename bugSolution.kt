fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]
    // Correct way to remove elements during iteration using iterator
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() == 2) {
            iterator.remove()
        }
    }
    println(list) //Output: [1]
    
    val list2 = mutableListOf(1,2,3,4,5)
    //Correct way to remove elements during iteration using indices
    for (i in list2.size -1 downTo 0 ){
        if (list2[i] == 2){
            list2.removeAt(i)
        }
    }
    println(list2)//Output: [1,3,4,5]
} 