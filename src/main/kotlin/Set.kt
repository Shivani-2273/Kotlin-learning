fun main() {

    //  Creating a read-only set using setOf()
    val readOnlySet = setOf("Apple", "Banana", "Cherry", "Apple")
    println("Read-only Set: $readOnlySet")

    // Creating a mutable set
    val mutableSet = mutableSetOf("Apple", "Banana", "Cherry", "Date", "Fig", "Grape", "Lemon")

    // Size of the set
    println("Size of the set: ${mutableSet.size}")

    // Check if the set contains an element
    println("Does the set contain 'Banana'? ${mutableSet.contains("Banana")}")

    // Check if the set contains all elements in another collection
    val checkAll = mutableSet.containsAll(setOf("Apple", "Cherry"))
    println("Does the set contain all elements in [Apple, Cherry]? $checkAll")

    // Iterate through the set using Iterator
    val iterator = mutableSet.iterator()
    println("Iterating through the set using Iterator:")
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // Using indices
    println("Element at index 2: ${mutableSet.elementAt(2)}")

    // Check if all elements satisfy a condition
    val allMatch = mutableSet.all { it.length > 3 }
    println("Do all elements have length greater than 3? $allMatch")

    // Check if any element satisfies a condition
    val anyMatch = mutableSet.any { it.startsWith("A") }
    println("Do any elements start with 'A'? $anyMatch")

    // Count elements satisfying a condition
    val count = mutableSet.count { it.length > 4 }
    println("Number of elements with length greater than 4: $count")

    // Drop the first two elements and create a new set
    val droppedSet = mutableSet.drop(2)
    println("Set after dropping the first two elements: $droppedSet")

    // Filter elements based on a condition
    val filteredSet = mutableSet.filter { it.length > 4 }
    println("Set after filtering elements with length greater than 4: $filteredSet")

    // Find the first element matching a condition
    val foundElement = mutableSet.find { it.endsWith("e") }
    println("First element ending with 'e': $foundElement")

    // Get the first element
    println("First element of the set: ${mutableSet.first()}")
}
