fun main() {
    // 1. Creating a read-only list using listOf()
    val readOnlyList = listOf("Apple", "Banana", "Cherry", "Date")
    println("Read-only List: $readOnlyList")

    // 2. Creating a mutable list using mutableListOf()
    val mutableList = mutableListOf("Elephant", "Giraffe", "Horse")
    println("Mutable List: $mutableList")

    // Adding elements to the mutable list
    mutableList.add("Lion")
    mutableList.addAll(listOf("Monkey", "Zebra"))
    println("After adding elements: $mutableList")

    // Removing elements from the mutable list
    mutableList.removeAt(1)
    println("After removing elements: $mutableList")

    mutableList.removeAll(listOf("Elephant", "Zebra"))
    println("After removing elements: $mutableList")

    // Accessing elements
    println("First element: ${mutableList.first()}")
    println("Last element: ${mutableList.last()}")
    println("Element at index 1: ${mutableList[1]}")

    // Iterating through the list
    println("Iterating through the list:")
    mutableList.forEachIndexed { index, animal ->
        println("$index: $animal")
    }

    // Checking if an element exists
    println("Does list contain 'Lion'? ${"Lion" in mutableList}")

    // Finding elements
    val foundAnimal = mutableList.find { it.startsWith("H") }
    println("First animal starting with 'H': $foundAnimal")

    // Sorting elements
    mutableList.sort()
    println("Sorted list: $mutableList")

    // Reversing the list
    mutableList.reverse()
    println("Reversed list: $mutableList")

    // Clearing the list
    mutableList.clear()
    println("Cleared list: $mutableList")

    // Checking if the list is empty
    println("Is the list empty? ${mutableList.isEmpty()}")

    // Adding elements at specific positions
    mutableList.addAll(0, listOf("Zebra", "Lion","Elephant","Monkey", "Giraffe","Lion"))
    println("List after adding at specific positions: $mutableList")

    // Sub-lists and slices
    val subList = mutableList.subList(0, 3)
    println("Sub-list from index 0 to 3: $subList")

    // Filtering elements
    val filteredList = mutableList.filter { it.length > 5 }
    println("Filtered list with animals having names longer than 5 characters: $filteredList")

    // Mapping elements
    val mappedList = mutableList.map { it.length }
    println("Mapped list containing lengths of each animal name: $mappedList")

    // Checking index of an element
    println("Index of 'Lion': ${mutableList.indexOf("Lion")}")

    // Checking the last index of an element
    println("Last index of 'Lion': ${mutableList.lastIndexOf("Lion")}")
}
