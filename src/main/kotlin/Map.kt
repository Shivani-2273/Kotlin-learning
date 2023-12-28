fun main() {
    // 1. Creating a read-only map using mapOf()
    val readOnlyMap = mapOf(
        "Apple" to 50,
        "Banana" to 30,
        "Cherry" to 100
    )

    println("Read-only Map: $readOnlyMap")

    // 2. Creating a mutable map using mutableMapOf()
    val mutableMap = mutableMapOf(
        "Elephant" to 2000,
        "Giraffe" to 1500
    )

    println("Mutable Map: $mutableMap")

    // 3. Adding elements to the mutable map
    mutableMap["Lion"] = 500
    mutableMap.put("Monkey", 300)

    println("After adding elements: $mutableMap")

    // 4. Removing elements from the mutable map
    mutableMap.remove("Elephant")
    println("After removing Elephant: $mutableMap")

    // 5. Updating values in the mutable map
    mutableMap["Lion"] = 550
    println("After updating Lion's value: $mutableMap")

    // 6. Accessing values using keys
    println("Price of Banana: ${readOnlyMap["Banana"]}")

    // 7. Checking if a key exists
    println("Does the map contain key 'Elephant'? ${"Elephant" in mutableMap}")

    // 8. Checking if a value exists
    println("Does the map contain value 550? ${mutableMap.containsValue(550)}")

    // 9. Printing all keys
    println("Keys in the mutable map: ${mutableMap.keys}")

    // 10. Printing all values
    println("Values in the mutable map: ${mutableMap.values}")

    // 11. Iterating through the map
    println("Iterating through the mutable map:")
    mutableMap.forEach { (key, value) ->
        println("$key: $value")
    }

    // 12. Clearing the map
    mutableMap.clear()
    println("Cleared mutable map: $mutableMap")
}
